package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Program32Header.java */
/* renamed from: pl.droidsonroids.relinker.f.j */
/* loaded from: classes3.dex */
public class C14780j extends AbstractC14775e {
    public C14780j(C14779i c14779i, AbstractC14774d abstractC14774d, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC14774d.f33034a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = abstractC14774d.f33035b + (j * abstractC14774d.f33037d);
        this.f33040a = c14779i.m356V(allocate, j2);
        this.f33041b = c14779i.m356V(allocate, 4 + j2);
        this.f33042c = c14779i.m356V(allocate, 8 + j2);
        this.f33043d = c14779i.m356V(allocate, j2 + 20);
    }
}
