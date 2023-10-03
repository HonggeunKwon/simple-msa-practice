package com.example.commonproject.cqs;

public interface CommandHandler<R, C extends  Command<R>> {
    R handle(C command);
}
