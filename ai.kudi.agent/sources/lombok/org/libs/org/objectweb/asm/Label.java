package lombok.org.libs.org.objectweb.asm;

import android.os.Handler;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.C14326a;
/* loaded from: classes.dex */
public final class Label {

    /* renamed from: a */
    public final ClassReader f31565a;

    /* renamed from: b */
    public final InterfaceC11824h f31566b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label(ClassReader classReader) {
        InterfaceC11824h $r1;
        Log_OC.getArray(classReader, "callback");
        this.f31565a = classReader;
        a$b$a $r3 = a$b$a.f31567d;
        $r1 = C13218k.m5625b($r3);
        this.f31566b = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final ClassReader m2127a() {
        ClassReader r1 = this.f31565a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2126a(final C14326a c14326a) {
        Log_OC.getArray(c14326a, "response");
        Handler $r3 = m2125b();
        $r3.post(new Runnable() { // from class: lombok.org.libs.org.objectweb.asm.a$b$c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Label $r32 = Label.this;
                ClassReader $r2 = $r32.m2127a();
                C14326a $r1 = c14326a;
                $r2.m2128a($r1);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Handler m2125b() {
        InterfaceC11824h $r2 = this.f31566b;
        Object $r1 = $r2.getValue();
        Handler $r3 = (Handler) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m2124e(final Exception exc) {
        Log_OC.getArray(exc, "exception");
        Handler $r3 = m2125b();
        $r3.post(new Runnable() { // from class: lombok.org.libs.org.objectweb.asm.a$b$b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Label $r32 = Label.this;
                ClassReader $r2 = $r32.m2127a();
                Exception $r1 = exc;
                $r2.m2129a($r1);
            }
        });
    }
}
