package lombok.org.asm.asm;

import a.a.a.c2.r;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.Item;
import lombok.org.asm.n1$a;
/* renamed from: lombok.org.asm.asm.d */
/* loaded from: classes.dex */
public class C14253d<T extends r & Comparable<? super T>> {

    /* renamed from: b */
    public volatile int f31341b = 0;

    /* renamed from: d */
    public T[] f31342d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final InterfaceC14250a m2334a() {
        InterfaceC14250a[] $r1 = this.f31342d;
        if ($r1 != null) {
            InterfaceC14250a $r2 = $r1[0];
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final InterfaceC14250a m2333a(int i) {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            int $i1 = this.f31341b;
            boolean $z02 = $i1 > 0;
            if (!$z02) {
                AssertionError $r2 = new AssertionError();
                throw $r2;
            }
        }
        Comparable[] comparableArr = this.f31342d;
        Log_OC.append(comparableArr);
        int $i12 = this.f31341b;
        this.f31341b = $i12 - 1;
        int $i13 = this.f31341b;
        if (i < $i13) {
            int $i14 = this.f31341b;
            m2332a(i, $i14);
            int $i15 = i - 1;
            int $i16 = $i15 / 2;
            if (i > 0) {
                Object[] objArr = comparableArr[i];
                Log_OC.append(objArr);
                Comparable $r4 = (Comparable) objArr;
                Object[] objArr2 = comparableArr[$i16];
                Log_OC.append(objArr2);
                if ($r4.compareTo(objArr2) < 0) {
                    m2332a(i, $i16);
                    add($i16);
                }
            }
            while (true) {
                int $i17 = i * 2;
                int $i18 = $i17 + 1;
                if ($i18 >= this.f31341b) {
                    break;
                }
                Comparable[] comparableArr2 = this.f31342d;
                Log_OC.append(comparableArr2);
                int $i2 = $i18 + 1;
                int $i3 = this.f31341b;
                if ($i2 < $i3) {
                    Comparable comparable = comparableArr2[$i2];
                    Log_OC.append(comparable);
                    Comparable $r42 = comparable;
                    Comparable comparable2 = comparableArr2[$i18];
                    Log_OC.append(comparable2);
                    int $i32 = $r42.compareTo(comparable2);
                    if ($i32 < 0) {
                        $i18 = $i2;
                    }
                }
                Comparable comparable3 = comparableArr2[i];
                Log_OC.append(comparable3);
                Comparable $r43 = comparable3;
                Comparable comparable4 = comparableArr2[$i18];
                Log_OC.append(comparable4);
                if ($r43.compareTo(comparable4) <= 0) {
                    break;
                }
                m2332a(i, $i18);
                i = $i18;
            }
        }
        int $i0 = this.f31341b;
        n1$a n1_a = comparableArr[$i0];
        Log_OC.append(n1_a);
        boolean $z03 = Item.f31289c;
        if ($z03) {
            C14253d $r6 = n1_a.m2338a();
            boolean $z1 = $r6 == this;
            if (!$z1) {
                AssertionError $r22 = new AssertionError();
                throw $r22;
            }
        }
        n1_a.m2335b(null);
        n1_a.m2337a(-1);
        int $i02 = this.f31341b;
        comparableArr[$i02] = 0;
        return n1_a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final void m2332a(int i, int i2) {
        InterfaceC14250a[] $r1 = this.f31342d;
        Log_OC.append($r1);
        InterfaceC14250a $r2 = $r1[i2];
        Log_OC.append($r2);
        InterfaceC14250a $r3 = $r1[i];
        Log_OC.append($r3);
        $r1[i] = $r2;
        $r1[i2] = $r3;
        $r2.m2337a(i);
        $r3.m2337a(i2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final void m2331a(InterfaceC14250a interfaceC14250a) {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            C14253d $r3 = ((n1$a) interfaceC14250a).m2193a();
            boolean $z02 = $r3 == null;
            if (!$z02) {
                AssertionError $r4 = new AssertionError();
                throw $r4;
            }
        }
        n1$a $r2 = (n1$a) interfaceC14250a;
        $r2.m2190b(this);
        InterfaceC14250a[] $r5 = this.f31342d;
        if ($r5 == null) {
            $r5 = new InterfaceC14250a[4];
            this.f31342d = $r5;
        } else {
            int $i0 = this.f31341b;
            int $i1 = $r5.length;
            if ($i0 >= $i1) {
                int $i02 = this.f31341b;
                Object[] $r6 = Arrays.copyOf($r5, $i02 * 2);
                Log_OC.loadImage($r6, "java.util.Arrays.copyOf(this, newSize)");
                $r5 = (InterfaceC14250a[]) $r6;
                this.f31342d = $r5;
            }
        }
        int $i03 = this.f31341b;
        int $i12 = $i03 + 1;
        this.f31341b = $i12;
        $r5[$i03] = interfaceC14250a;
        $r2.f31459d = $i03;
        add($i03);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void add(int i) {
        while (i > 0) {
            Comparable[] comparableArr = this.f31342d;
            Log_OC.append(comparableArr);
            int $i0 = i - 1;
            int $i2 = $i0 / 2;
            Comparable comparable = comparableArr[$i2];
            Log_OC.append(comparable);
            Comparable $r3 = comparable;
            Comparable comparable2 = comparableArr[i];
            Log_OC.append(comparable2);
            int $i02 = $r3.compareTo(comparable2);
            if ($i02 <= 0) {
                return;
            }
            m2332a(i, $i2);
            i = $i2;
        }
    }
}
