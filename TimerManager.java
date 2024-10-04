package com.Codesoft;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;

public class TimerManager {
    private ScheduledExecutorService executor;
    private Runnable onTimeUpCallback;
    private Future<?> scheduledTask;

    public TimerManager(Runnable onTimeUpCallback) {
        this.onTimeUpCallback = onTimeUpCallback;
    }

    public void startTimer(int seconds) {
        executor = Executors.newScheduledThreadPool(1);
        scheduledTask = executor.schedule(onTimeUpCallback, seconds, TimeUnit.SECONDS);
    }

    public void stopTimer() {
        if (scheduledTask != null && !scheduledTask.isDone()) {
            scheduledTask.cancel(true);
        }
        executor.shutdown();
    }
}
