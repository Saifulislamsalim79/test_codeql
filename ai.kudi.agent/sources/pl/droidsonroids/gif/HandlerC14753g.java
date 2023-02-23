package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InvalidationHandler.java */
/* renamed from: pl.droidsonroids.gif.g */
/* loaded from: classes3.dex */
public class HandlerC14753g extends Handler {

    /* renamed from: a */
    private final WeakReference<C14741b> f33015a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC14753g(C14741b c14741b) {
        super(Looper.getMainLooper());
        this.f33015a = new WeakReference<>(c14741b);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C14741b c14741b = this.f33015a.get();
        if (c14741b == null) {
            return;
        }
        if (message.what == -1) {
            c14741b.invalidateSelf();
            return;
        }
        Iterator<InterfaceC14740a> it = c14741b.f32980z.iterator();
        while (it.hasNext()) {
            it.next().m419a(message.what);
        }
    }
}
