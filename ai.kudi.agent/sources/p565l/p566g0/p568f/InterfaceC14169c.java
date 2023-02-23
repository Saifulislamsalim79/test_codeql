package p565l.p566g0.p568f;

import java.io.IOException;
import p565l.AbstractC14135d0;
import p565l.C14116a0;
import p565l.C14131c0;
import p576m.InterfaceC14364r;
/* compiled from: HttpCodec.java */
/* renamed from: l.g0.f.c */
/* loaded from: classes3.dex */
public interface InterfaceC14169c {
    /* renamed from: a */
    void mo1527a(C14116a0 c14116a0) throws IOException;

    /* renamed from: b */
    AbstractC14135d0 mo1526b(C14131c0 c14131c0) throws IOException;

    /* renamed from: c */
    InterfaceC14364r mo1525c(C14116a0 c14116a0, long j);

    void cancel();

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    C14131c0.C14132a readResponseHeaders(boolean z) throws IOException;
}
