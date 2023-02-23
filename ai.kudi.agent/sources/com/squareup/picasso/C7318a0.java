package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Stats.java */
/* renamed from: com.squareup.picasso.a0 */
/* loaded from: classes2.dex */
public class C7318a0 {

    /* renamed from: a */
    final HandlerThread f17306a;

    /* renamed from: b */
    final InterfaceC7331d f17307b;

    /* renamed from: c */
    final Handler f17308c;

    /* renamed from: d */
    long f17309d;

    /* renamed from: e */
    long f17310e;

    /* renamed from: f */
    long f17311f;

    /* renamed from: g */
    long f17312g;

    /* renamed from: h */
    long f17313h;

    /* renamed from: i */
    long f17314i;

    /* renamed from: j */
    long f17315j;

    /* renamed from: k */
    long f17316k;

    /* renamed from: l */
    int f17317l;

    /* renamed from: m */
    int f17318m;

    /* renamed from: n */
    int f17319n;

    /* compiled from: Stats.java */
    /* renamed from: com.squareup.picasso.a0$a */
    /* loaded from: classes2.dex */
    private static class HandlerC7319a extends Handler {

        /* renamed from: a */
        private final C7318a0 f17320a;

        /* compiled from: Stats.java */
        /* renamed from: com.squareup.picasso.a0$a$a */
        /* loaded from: classes2.dex */
        class RunnableC7320a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Message f17321c;

            RunnableC7320a(HandlerC7319a handlerC7319a, Message message) {
                this.f17321c = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f17321c.what);
            }
        }

        HandlerC7319a(Looper looper, C7318a0 c7318a0) {
            super(looper);
            this.f17320a = c7318a0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f17320a.m18989j();
            } else if (i == 1) {
                this.f17320a.m18988k();
            } else if (i == 2) {
                this.f17320a.m18991h(message.arg1);
            } else if (i == 3) {
                this.f17320a.m18990i(message.arg1);
            } else if (i != 4) {
                C7360t.f17429p.post(new RunnableC7320a(this, message));
            } else {
                this.f17320a.m18987l((Long) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7318a0(InterfaceC7331d interfaceC7331d) {
        this.f17307b = interfaceC7331d;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f17306a = handlerThread;
        handlerThread.start();
        C7332d0.m18949h(this.f17306a.getLooper());
        this.f17308c = new HandlerC7319a(this.f17306a.getLooper(), this);
    }

    /* renamed from: g */
    private static long m18992g(int i, long j) {
        return j / i;
    }

    /* renamed from: m */
    private void m18986m(Bitmap bitmap, int i) {
        int m18948i = C7332d0.m18948i(bitmap);
        Handler handler = this.f17308c;
        handler.sendMessage(handler.obtainMessage(i, m18948i, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7322b0 m18998a() {
        return new C7322b0(this.f17307b.mo18905a(), this.f17307b.size(), this.f17309d, this.f17310e, this.f17311f, this.f17312g, this.f17313h, this.f17314i, this.f17315j, this.f17316k, this.f17317l, this.f17318m, this.f17319n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m18997b(Bitmap bitmap) {
        m18986m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m18996c(Bitmap bitmap) {
        m18986m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m18995d() {
        this.f17308c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m18994e() {
        this.f17308c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m18993f(long j) {
        Handler handler = this.f17308c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* renamed from: h */
    void m18991h(long j) {
        int i = this.f17318m + 1;
        this.f17318m = i;
        long j2 = this.f17312g + j;
        this.f17312g = j2;
        this.f17315j = m18992g(i, j2);
    }

    /* renamed from: i */
    void m18990i(long j) {
        this.f17319n++;
        long j2 = this.f17313h + j;
        this.f17313h = j2;
        this.f17316k = m18992g(this.f17318m, j2);
    }

    /* renamed from: j */
    void m18989j() {
        this.f17309d++;
    }

    /* renamed from: k */
    void m18988k() {
        this.f17310e++;
    }

    /* renamed from: l */
    void m18987l(Long l) {
        this.f17317l++;
        long longValue = this.f17311f + l.longValue();
        this.f17311f = longValue;
        this.f17314i = m18992g(this.f17317l, longValue);
    }
}
