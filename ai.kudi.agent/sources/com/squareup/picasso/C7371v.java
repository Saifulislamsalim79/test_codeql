package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C7332d0;
import com.squareup.picasso.C7360t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PicassoExecutorService.java */
/* renamed from: com.squareup.picasso.v */
/* loaded from: classes2.dex */
public class C7371v extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService.java */
    /* renamed from: com.squareup.picasso.v$a */
    /* loaded from: classes2.dex */
    private static final class C7372a extends FutureTask<RunnableC7323c> implements Comparable<C7372a> {

        /* renamed from: c */
        private final RunnableC7323c f17477c;

        C7372a(RunnableC7323c runnableC7323c) {
            super(runnableC7323c, null);
            this.f17477c = runnableC7323c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C7372a c7372a) {
            C7360t.EnumC7367f m18966r = this.f17477c.m18966r();
            C7360t.EnumC7367f m18966r2 = c7372a.f17477c.m18966r();
            return m18966r == m18966r2 ? this.f17477c.f17355c - c7372a.f17477c.f17355c : m18966r2.ordinal() - m18966r.ordinal();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7371v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C7332d0.ThreadFactoryC7335c());
    }

    /* renamed from: b */
    private void m18865b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public void m18866a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    m18865b(3);
                    return;
                } else {
                    m18865b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m18865b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m18865b(3);
                            return;
                        default:
                            m18865b(3);
                            return;
                    }
            }
            m18865b(2);
            return;
        }
        m18865b(3);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        C7372a c7372a = new C7372a((RunnableC7323c) runnable);
        execute(c7372a);
        return c7372a;
    }
}
