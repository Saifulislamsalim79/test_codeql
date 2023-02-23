package com.uber.autodispose.p195q.p196b;

import java.util.concurrent.atomic.AtomicBoolean;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: MainThreadDisposable.java */
/* renamed from: com.uber.autodispose.q.b.DataProvider */
/* loaded from: classes.dex */
public abstract class DataProvider implements FavoritesArrayAdapter {
    private final AtomicBoolean started;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DataProvider() {
        AtomicBoolean $r1 = new AtomicBoolean();
        this.started = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p448c0.FavoritesArrayAdapter
    public final void backup() {
        AtomicBoolean $r1 = this.started;
        boolean $z0 = $r1.compareAndSet(false, true);
        if ($z0) {
            boolean $z02 = C7426c.m18759a();
            if ($z02) {
                mo18760e();
                return;
            }
            Item $r2 = ContextUtils.LogError();
            Runnable r4 = new RunnableC7425b(this);
            Runnable r5 = r4;
            $r2.toString(r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p448c0.FavoritesArrayAdapter
    public final boolean close() {
        AtomicBoolean $r1 = this.started;
        boolean $z0 = $r1.get();
        return $z0;
    }

    /* renamed from: e */
    protected abstract void mo18760e();
}
