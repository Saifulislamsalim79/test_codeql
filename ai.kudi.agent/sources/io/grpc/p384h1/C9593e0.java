package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.p384h1.InterfaceC9690k;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* compiled from: ExponentialBackoffPolicy.java */
/* renamed from: io.grpc.h1.e0 */
/* loaded from: classes2.dex */
public final class C9593e0 implements InterfaceC9690k {

    /* renamed from: a */
    private Random f22469a = new Random();

    /* renamed from: b */
    private long f22470b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private long f22471c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    private double f22472d = 1.6d;

    /* renamed from: e */
    private double f22473e = 0.2d;

    /* renamed from: f */
    private long f22474f = this.f22470b;

    /* compiled from: ExponentialBackoffPolicy.java */
    /* renamed from: io.grpc.h1.e0$a */
    /* loaded from: classes2.dex */
    public static final class C9594a implements InterfaceC9690k.InterfaceC9691a {
        @Override // io.grpc.p384h1.InterfaceC9690k.InterfaceC9691a
        public InterfaceC9690k get() {
            return new C9593e0();
        }
    }

    /* renamed from: b */
    private long m14373b(double d, double d2) {
        C5051n.m25790d(d2 >= d);
        return (long) ((this.f22469a.nextDouble() * (d2 - d)) + d);
    }

    @Override // io.grpc.p384h1.InterfaceC9690k
    /* renamed from: a */
    public long mo14179a() {
        long j = this.f22474f;
        double d = j;
        double d2 = this.f22472d;
        Double.isNaN(d);
        this.f22474f = Math.min((long) (d2 * d), this.f22471c);
        double d3 = this.f22473e;
        Double.isNaN(d);
        Double.isNaN(d);
        return j + m14373b((-d3) * d, d3 * d);
    }
}
