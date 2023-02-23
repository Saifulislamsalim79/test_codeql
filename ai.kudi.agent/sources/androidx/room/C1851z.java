package androidx.room;

import android.content.Context;
import androidx.room.AbstractC1802o0;
import androidx.room.p062y0.InterfaceC1849a;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p201g.p262t.p263a.InterfaceC8094h;
/* compiled from: DatabaseConfiguration.java */
/* renamed from: androidx.room.z */
/* loaded from: classes2.dex */
public class C1851z {

    /* renamed from: a */
    public final InterfaceC8094h.InterfaceC8098c f5605a;

    /* renamed from: b */
    public final Context f5606b;

    /* renamed from: c */
    public final String f5607c;

    /* renamed from: d */
    public final AbstractC1802o0.C1806d f5608d;

    /* renamed from: e */
    public final List<AbstractC1802o0.AbstractC1804b> f5609e;

    /* renamed from: f */
    public final AbstractC1802o0.AbstractC1807e f5610f;

    /* renamed from: g */
    public final List<Object> f5611g;

    /* renamed from: h */
    public final List<InterfaceC1849a> f5612h;

    /* renamed from: i */
    public final boolean f5613i;

    /* renamed from: j */
    public final AbstractC1802o0.EnumC1805c f5614j;

    /* renamed from: k */
    public final Executor f5615k;

    /* renamed from: l */
    public final Executor f5616l;

    /* renamed from: m */
    public final boolean f5617m;

    /* renamed from: n */
    public final boolean f5618n;

    /* renamed from: o */
    public final boolean f5619o;

    /* renamed from: p */
    private final Set<Integer> f5620p;

    /* renamed from: q */
    public final Callable<InputStream> f5621q;

    public C1851z(Context context, String str, InterfaceC8094h.InterfaceC8098c interfaceC8098c, AbstractC1802o0.C1806d c1806d, List<AbstractC1802o0.AbstractC1804b> list, boolean z, AbstractC1802o0.EnumC1805c enumC1805c, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, AbstractC1802o0.AbstractC1807e abstractC1807e, List<Object> list2, List<InterfaceC1849a> list3) {
        this.f5605a = interfaceC8098c;
        this.f5606b = context;
        this.f5607c = str;
        this.f5608d = c1806d;
        this.f5609e = list;
        this.f5613i = z;
        this.f5614j = enumC1805c;
        this.f5615k = executor;
        this.f5616l = executor2;
        this.f5617m = z2;
        this.f5618n = z3;
        this.f5619o = z4;
        this.f5620p = set;
        this.f5621q = callable;
        this.f5610f = abstractC1807e;
        this.f5611g = list2 == null ? Collections.emptyList() : list2;
        this.f5612h = list3 == null ? Collections.emptyList() : list3;
    }

    /* renamed from: a */
    public boolean m34429a(int i, int i2) {
        Set<Integer> set;
        return !((i > i2) && this.f5619o) && this.f5618n && ((set = this.f5620p) == null || !set.contains(Integer.valueOf(i)));
    }
}
