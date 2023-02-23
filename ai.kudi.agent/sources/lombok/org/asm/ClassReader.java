package lombok.org.asm;

import com.smartlook.coroutines.CoroutineExceptionHandler;
import kotlin.C11709c;
import kotlin.p476c0.InterfaceC11719g;
/* loaded from: classes.dex */
public final class ClassReader {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final Throwable m2381a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException $r2 = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C11709c.m10411a($r2, th);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2380a(InterfaceC11719g interfaceC11719g, Throwable th) {
        CoroutineExceptionHandler.C7205a $r2 = CoroutineExceptionHandler.C7205a.f17117a;
        try {
            InterfaceC11719g.InterfaceC11722b $r3 = interfaceC11719g.get($r2);
            CoroutineExceptionHandler $r4 = (CoroutineExceptionHandler) $r3;
            if ($r4 != null) {
                $r4.m19313a(interfaceC11719g, th);
            } else {
                Log.write(interfaceC11719g, th);
            }
        } catch (Throwable $r5) {
            Throwable $r1 = m2381a(th, $r5);
            Log.write(interfaceC11719g, $r1);
        }
    }
}
