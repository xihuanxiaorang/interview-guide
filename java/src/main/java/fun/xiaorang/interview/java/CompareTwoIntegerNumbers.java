package fun.xiaorang.interview.java;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaorang
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/interview-guide">interview-guide</a>
 * @Copyright 博客：<a href="https://docs.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2024/07/21 11:14
 */
@Slf4j
public class CompareTwoIntegerNumbers {
  public static void main(String[] args) {
    Integer a1 = 100;
    Integer a2 = 100;
    Integer a3 = 128;
    Integer a4 = 128;
    int a5 = 128;
    log.debug("a1 == a2？{}", a1 == a2);
    log.debug("a3 == a4？{}", a3 == a4);
    log.debug("a3 == a5？{}", a3 == a5);
  }
}
