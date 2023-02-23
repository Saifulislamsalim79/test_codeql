package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Program64Header.java */
/* renamed from: pl.droidsonroids.relinker.f.k */
/* loaded from: classes3.dex */
public class C14781k extends AbstractC14775e {
    public C14781k(C14779i c14779i, AbstractC14774d abstractC14774d, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC14774d.f33034a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = abstractC14774d.f33035b + (j * abstractC14774d.f33037d);
        this.f33040a = c14779i.m356V(allocate, j2);
        this.f33041b = c14779i.m358O(allocate, 8 + j2);
        this.f33042c = c14779i.m358O(allocate, 16 + j2);
        this.f33043d = c14779i.m358O(allocate, j2 + 40);
    }
}
