package com.example.commonproject.cqs;

public interface Bus {
    <R,C extends Command<R>> R executeCommand(C command);
    <R,Q extends Query<R>> R executeQuery(Q query);
}
