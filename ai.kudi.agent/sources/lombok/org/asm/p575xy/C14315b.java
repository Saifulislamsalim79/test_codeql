package lombok.org.asm.p575xy;

import kotlin.p491i0.C11841h;
import lombok.org.asm.AbstractC14272i;
import lombok.org.asm.asm.ByteVector;
import lombok.org.asm.asm.MergeStrategy;
/* renamed from: lombok.org.asm.xy.b */
/* loaded from: classes.dex */
public final class C14315b extends C14324p {

    /* renamed from: a */
    public static final C14315b f31501a;

    /* renamed from: b */
    public static final AbstractC14272i f31502b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        int $i0;
        C14315b $r0 = new C14315b();
        f31501a = $r0;
        int $i02 = MergeStrategy.f31334s;
        $i0 = C11841h.m10271a(64, $i02);
        ClassWriter $r1 = new ClassWriter($r0, ByteVector.m2347a("com.smartlook.coroutines.io.parallelism", $i0, 0, 0, 12, null), "Dispatchers.IO", 1);
        f31502b = $r1;
    }

    public C14315b() {
        super(0, 0, null, 7, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        UnsupportedOperationException $r1 = new UnsupportedOperationException("Dispatchers.Default cannot be closed");
        throw $r1;
    }

    @Override // lombok.org.asm.AbstractC14272i
    public String toString() {
        return "Dispatchers.Default";
    }
}
