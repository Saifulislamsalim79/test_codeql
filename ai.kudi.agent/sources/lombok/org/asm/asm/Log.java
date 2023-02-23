package lombok.org.asm.asm;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* loaded from: classes.dex */
public final class Log {

    /* renamed from: N */
    public static final int f31331N;

    /* renamed from: c */
    public static final WeakHashMap<Class<? extends Throwable>, InterfaceC11767l<Throwable, Throwable>> f31332c;

    /* renamed from: d */
    public static final ReentrantReadWriteLock f31333d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        int $i0 = get(Throwable.class, -1);
        f31331N = $i0;
        ReentrantReadWriteLock $r0 = new ReentrantReadWriteLock();
        f31333d = $r0;
        WeakHashMap $r1 = new WeakHashMap();
        f31332c = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int get(Class cls, int i) {
        Object $r5;
        Class $r3;
        C11754a.m10361e(cls);
        int $i2 = 0;
        do {
            try {
                Field[] $r1 = cls.getDeclaredFields();
                int $i4 = 0;
                for (Field $r2 : $r1) {
                    int $i5 = $r2.getModifiers();
                    boolean $z0 = Modifier.isStatic($i5);
                    if (!$z0) {
                        $i4++;
                    }
                }
                $i2 += $i4;
                $r3 = cls.getSuperclass();
                cls = $r3;
            } catch (Throwable $r6) {
                Object $r7 = C13291q.m5358a($r6);
                $r5 = $r7;
                C13288p.m5362a($r7);
            }
        } while ($r3 != null);
        Object $r4 = java.lang.Integer.valueOf($i2);
        $r5 = $r4;
        C13288p.m5362a($r4);
        Object $r42 = java.lang.Integer.valueOf(i);
        boolean $z02 = C13288p.m5360c($r5);
        if ($z02) {
            $r5 = $r42;
        }
        Number $r8 = (Number) $r5;
        int $i1 = $r8.intValue();
        return $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Incorrect condition in loop: B:47:0x00f6 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [lombok.org.asm.asm.ResponseProxyHandler] */
    /* JADX WARN: Type inference failed for: r34v0, types: [lombok.org.asm.asm.ArraysKt___ArraysKt$withIndex$5] */
    /* JADX WARN: Type inference failed for: r35v0, types: [lombok.org.asm.asm.ZoomButtonsController$1] */
    /* JADX WARN: Type inference failed for: r36v0, types: [lombok.org.asm.asm.FactoryProvider2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable write(java.lang.Throwable r41) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.asm.Log.write(java.lang.Throwable):java.lang.Throwable");
    }
}
