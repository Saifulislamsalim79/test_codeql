package pl.droidsonroids.gif;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SafeRunnable.java */
/* renamed from: pl.droidsonroids.gif.k */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC14757k implements Runnable {

    /* renamed from: c */
    final C14741b f33017c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC14757k(C14741b c14741b) {
        this.f33017c = c14741b;
    }

    /* renamed from: a */
    abstract void mo392a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f33017c.m414e()) {
                return;
            }
            mo392a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
