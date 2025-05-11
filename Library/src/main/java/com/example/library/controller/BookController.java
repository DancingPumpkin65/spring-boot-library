package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.service.BookService;
import com.example.library.service.LibrarianService;
import com.example.library.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService svc;
    private final LibrarianService lst;
    private final UserService ust;

    public BookController(BookService svc,
                          LibrarianService lst,
                          UserService ust) {
        this.svc = svc;
        this.lst = lst;
        this.ust = ust;
    }

    @GetMapping
    public String list(Model m) {
        m.addAttribute("books", svc.findAll());
        return "books/list";
    }

    @GetMapping("/new")
    public String form(Model m) {
        m.addAttribute("book", new Book());
        m.addAttribute("librarians", lst.findAll());
        m.addAttribute("users", ust.findAll());
        return "books/new";
    }

    @PostMapping
    public String save(@ModelAttribute Book book, RedirectAttributes ra) {
        svc.save(book);
        ra.addFlashAttribute("successMessage", "Book saved successfully!");
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model m, RedirectAttributes ra) {
        Optional<Book> opt = svc.findById(id);
        if (opt.isPresent()) {
            m.addAttribute("book", opt.get());
            m.addAttribute("librarians", lst.findAll());
            m.addAttribute("users", ust.findAll());
            return "books/new";
        } else {
            ra.addFlashAttribute("errorMessage", "Book not found: " + id);
            return "redirect:/books";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, RedirectAttributes ra) {
        if (svc.findById(id).isPresent()) {
            svc.delete(id);
            ra.addFlashAttribute("successMessage", "Book deleted successfully!");
        } else {
            ra.addFlashAttribute("errorMessage", "Book not found: " + id);
        }
        return "redirect:/books";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable int id, Model m, RedirectAttributes ra) {
        Optional<Book> opt = svc.findById(id);
        if (opt.isPresent()) {
            m.addAttribute("book", opt.get());
            return "books/details";
        } else {
            ra.addFlashAttribute("errorMessage", "Book not found: " + id);
            return "redirect:/books";
        }
    }

    @GetMapping("/inquiry")
    public String inquiry(@RequestParam(required=false) String name, Model m) {
        m.addAttribute("books", svc.inquiryByName(name));
        return "books/list";
    }

}
