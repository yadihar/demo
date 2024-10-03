package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller  
public class Hello{  

@RequestMapping("/")  
public String Hello()   
{  
   //return "Hello world";  
   return "index"; 
} 
} 

