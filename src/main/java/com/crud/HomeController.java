package com.crud;

import com.crud.bean.BoardVO;
import com.crud.dao.BoardDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value="/board/add", method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";}

    @RequestMapping(value="/board/addok", method=RequestMethod.POST)
    public String addPostOK(BoardVO vo){
        int i=BoardDAO.insertBoard(vo);
        if(i==0) System.out.println("데이타 추가 실패!");
        else System.out.println("데이터 추가 성공!");
        return "redirect:list";
    }


    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
