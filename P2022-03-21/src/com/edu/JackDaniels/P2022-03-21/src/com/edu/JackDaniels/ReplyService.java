package com.edu.JackDaniels;

import java.util.List;

public interface ReplyService {
   public List<Reply> list(int bno); //댓글리스트
   public int count(int bno); //댓글 수
   public void create(Reply dto); //댓글 작성
   
}
