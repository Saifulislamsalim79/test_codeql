package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RenderTask.java */
/* renamed from: pl.droidsonroids.gif.j */
/* loaded from: classes3.dex */
public class C14756j extends AbstractRunnableC14757k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C14756j(C14741b c14741b) {
        super(c14741b);
    }

    @Override // pl.droidsonroids.gif.AbstractRunnableC14757k
    /* renamed from: a */
    public void mo392a() {
        C14741b c14741b = this.f33017c;
        long m426q = c14741b.f32979y.m426q(c14741b.f32978x);
        if (m426q >= 0) {
            this.f33017c.f32975e = SystemClock.uptimeMillis() + m426q;
            if (this.f33017c.isVisible() && this.f33017c.f32974d) {
                C14741b c14741b2 = this.f33017c;
                if (!c14741b2.f32965D) {
                    c14741b2.f32973c.remove(this);
                    C14741b c14741b3 = this.f33017c;
                    c14741b3.f32969H = c14741b3.f32973c.schedule(this, m426q, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f33017c.f32980z.isEmpty() && this.f33017c.m417b() == this.f33017c.f32979y.m434i() - 1) {
                C14741b c14741b4 = this.f33017c;
                c14741b4.f32966E.sendEmptyMessageAtTime(c14741b4.m416c(), this.f33017c.f32975e);
            }
        } else {
            C14741b c14741b5 = this.f33017c;
            c14741b5.f32975e = Long.MIN_VALUE;
            c14741b5.f32974d = false;
        }
        if (!this.f33017c.isVisible() || this.f33017c.f32966E.hasMessages(-1)) {
            return;
        }
        this.f33017c.f32966E.sendEmptyMessageAtTime(-1, 0L);
    }
}
