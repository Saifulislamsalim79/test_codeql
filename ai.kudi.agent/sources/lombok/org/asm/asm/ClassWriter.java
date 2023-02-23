package lombok.org.asm.asm;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import lombok.org.asm.Item;
/* loaded from: classes.dex */
public final class ClassWriter {

    /* renamed from: c */
    public static final String f31326c;

    /* renamed from: g */
    public static final String f31327g;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Object $r2;
        Object $r22;
        try {
            Class $r0 = Class.forName("kotlin.c0.k.a.a");
            Object $r1 = $r0.getCanonicalName();
            $r2 = $r1;
            C13288p.m5362a($r1);
        } catch (Throwable $r3) {
            Object $r4 = C13291q.m5358a($r3);
            $r2 = $r4;
            C13288p.m5362a($r4);
        }
        Throwable $r32 = C13288p.m5361b($r2);
        if ($r32 != null) {
            $r2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String $r12 = (String) $r2;
        f31326c = $r12;
        try {
            Class $r02 = Class.forName("a.a.a.c2.d");
            Object $r13 = $r02.getCanonicalName();
            $r22 = $r13;
            C13288p.m5362a($r13);
        } catch (Throwable $r5) {
            Object $r42 = C13291q.m5358a($r5);
            $r22 = $r42;
            C13288p.m5362a($r42);
        }
        Throwable $r33 = C13288p.m5361b($r22);
        if ($r33 != null) {
            $r22 = "com.smartlook.coroutines.internal.StackTraceRecoveryKt";
        }
        String $r14 = (String) $r22;
        f31327g = $r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final Throwable m2346a(Throwable th) {
        Throwable $r1;
        boolean $z0 = Item.f31288b;
        if ($z0 && ($r1 = Log.write(th)) != null) {
            StackTraceElement[] $r2 = $r1.getStackTrace();
            int $i1 = $r2.length;
            String $r3 = f31327g;
            int $i2 = get($r2, $r3);
            int $i0 = $i2 + 1;
            String $r32 = f31326c;
            int $i3 = get($r2, $r32);
            int $i4 = 0;
            int $i12 = ($i1 - $i2) - ($i3 == -1 ? 0 : $i1 - $i3);
            StackTraceElement[] $r4 = new StackTraceElement[$i12];
            while ($i4 < $i12) {
                StackTraceElement $r5 = $i4 == 0 ? get("Coroutine boundary") : $r2[($i0 + $i4) - 1];
                $r4[$i4] = $r5;
                $i4++;
            }
            $r1.setStackTrace($r4);
            return $r1;
        }
        return th;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:71:0x0199 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[LOOP:3: B:44:0x00c9->B:58:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139 A[EDGE_INSN: B:86:0x0139->B:59:0x0139 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable m2345e(java.lang.Throwable r32, kotlin.p476c0.p478k.p479a.InterfaceC11739e r33) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.asm.ClassWriter.m2345e(java.lang.Throwable, kotlin.c0.k.a.e):java.lang.Throwable");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int get(StackTraceElement[] stackTraceElementArr, String str) {
        int $i0 = stackTraceElementArr.length;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            StackTraceElement $r2 = stackTraceElementArr[$i1];
            String $r3 = $r2.getClassName();
            boolean $z0 = Log_OC.append(str, $r3);
            if ($z0) {
                return $i1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final StackTraceElement get(String str) {
        String $r1 = "\b\b\b(" + str;
        StackTraceElement $r0 = new StackTraceElement($r1, "\b", "\b", -1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Throwable get(Throwable th) {
        Throwable $r1 = th.getCause();
        if ($r1 != null) {
            Class $r2 = $r1.getClass();
            Class $r3 = th.getClass();
            boolean $z0 = Log_OC.append($r2, $r3);
            boolean $z1 = true;
            if (!$z0) {
                return th;
            }
            StackTraceElement[] $r4 = th.getStackTrace();
            int $i0 = $r4.length;
            int $i1 = 0;
            while (true) {
                if ($i1 >= $i0) {
                    $z1 = false;
                    break;
                }
                StackTraceElement $r5 = $r4[$i1];
                boolean $z02 = get($r5);
                if ($z02) {
                    break;
                }
                $i1++;
            }
            if ($z1) {
                return $r1;
            }
        }
        return th;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean get(StackTraceElement stackTraceElement) {
        boolean $z0;
        String $r1 = stackTraceElement.getClassName();
        $z0 = C13276s.m5447E($r1, "\b\b\b", false, 2, null);
        return $z0;
    }
}
