package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: GifRenderingExecutor.java */
/* renamed from: pl.droidsonroids.gif.d */
/* loaded from: classes3.dex */
final class C14745d extends ScheduledThreadPoolExecutor {

    /* compiled from: GifRenderingExecutor.java */
    /* renamed from: pl.droidsonroids.gif.d$b */
    /* loaded from: classes3.dex */
    private static final class C14747b {

        /* renamed from: a */
        private static final C14745d f33008a = new C14745d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C14745d m405a() {
        return C14747b.f33008a;
    }

    private C14745d() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
