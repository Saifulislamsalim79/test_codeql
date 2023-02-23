package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Dynamic64Structure.java */
/* renamed from: pl.droidsonroids.relinker.f.b */
/* loaded from: classes3.dex */
public class C14772b extends AbstractC14773c {
    public C14772b(C14779i c14779i, AbstractC14774d abstractC14774d, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC14774d.f33034a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 16);
        this.f33032a = c14779i.m358O(allocate, j2);
        this.f33033b = c14779i.m358O(allocate, j2 + 8);
    }
}
