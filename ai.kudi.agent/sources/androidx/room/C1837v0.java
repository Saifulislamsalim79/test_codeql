package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8094h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* renamed from: androidx.room.v0 */
/* loaded from: classes2.dex */
public class C1837v0 implements InterfaceC8094h.InterfaceC8098c {

    /* renamed from: a */
    private final String f5571a;

    /* renamed from: b */
    private final File f5572b;

    /* renamed from: c */
    private final Callable<InputStream> f5573c;

    /* renamed from: d */
    private final InterfaceC8094h.InterfaceC8098c f5574d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1837v0(String str, File file, Callable<InputStream> callable, InterfaceC8094h.InterfaceC8098c interfaceC8098c) {
        this.f5571a = str;
        this.f5572b = file;
        this.f5573c = callable;
        this.f5574d = interfaceC8098c;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.InterfaceC8098c
    /* renamed from: a */
    public InterfaceC8094h mo16742a(InterfaceC8094h.C8096b c8096b) {
        return new C1834u0(c8096b.f19451a, this.f5571a, this.f5572b, this.f5573c, c8096b.f19453c.f19450a, this.f5574d.mo16742a(c8096b));
    }
}
