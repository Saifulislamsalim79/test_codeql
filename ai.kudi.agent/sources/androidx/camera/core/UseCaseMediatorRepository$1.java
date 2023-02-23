package androidx.camera.core;

import androidx.camera.core.impl.C1236m;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Service;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class UseCaseMediatorRepository$1 implements Service {

    /* renamed from: d */
    final /* synthetic */ C1221c f3685d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onDestroy(PreferenceActivity preferenceActivity) {
        C1221c $r3 = this.f3685d;
        Object $r4 = $r3.f3691a;
        synchronized ($r4) {
            C1221c $r32 = this.f3685d;
            Map $r5 = $r32.f3692b;
            $r5.remove(preferenceActivity);
        }
        AbstractC1565i $r1 = preferenceActivity.getLifecycle();
        $r1.c(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart(androidx.lifecycle.PreferenceActivity r21) {
        /*
            r20 = this;
            r0 = r20
            androidx.camera.core.c r3 = r0.f3685d
            java.lang.Object r4 = r3.f3691a
            monitor-enter(r4)
            r0 = r20
            androidx.camera.core.c r3 = r0.f3685d     // Catch: java.lang.Throwable -> L6a
            java.util.Map<androidx.lifecycle.o, androidx.camera.core.UseCaseMediatorLifecycleController> r5 = r3.f3692b     // Catch: java.lang.Throwable -> L6a
            java.util.Set r6 = r5.entrySet()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L6a
        L15:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L45
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L6a
            r11 = r9
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L6a
            r10 = r11
            java.lang.Object r9 = r10.getKey()     // Catch: java.lang.Throwable -> L6a
            r0 = r21
            if (r9 != r0) goto L2c
            goto L15
        L2c:
            java.lang.Object r9 = r10.getValue()     // Catch: java.lang.Throwable -> L6a
            r13 = r9
            androidx.camera.core.UseCaseMediatorLifecycleController r13 = (androidx.camera.core.UseCaseMediatorLifecycleController) r13     // Catch: java.lang.Throwable -> L6a
            r12 = r13
            androidx.camera.core.impl.m r14 = r12.m36734a()     // Catch: java.lang.Throwable -> L6a
            r14.m36704b()     // Catch: java.lang.Throwable -> L6a
            java.lang.NullPointerException r15 = new java.lang.NullPointerException
            java.lang.String r16 = "Null throw statement replaced by Soot"
            r0 = r16
            r15.<init>(r0)
            throw r15
        L45:
            r0 = r20
            androidx.camera.core.c r3 = r0.f3685d     // Catch: java.lang.Throwable -> L6a
            r0 = r21
            r3.d = r0     // Catch: java.lang.Throwable -> L6a
            r0 = r20
            androidx.camera.core.c r3 = r0.f3685d     // Catch: java.lang.Throwable -> L6a
            java.util.List<androidx.lifecycle.o> r0 = r3.f3693c     // Catch: java.lang.Throwable -> L6a
            r17 = r0
            r0 = r20
            androidx.camera.core.c r3 = r0.f3685d     // Catch: java.lang.Throwable -> L6a
            androidx.lifecycle.PreferenceActivity r0 = r3.d     // Catch: java.lang.Throwable -> L6a
            r21 = r0
            r18 = 0
            r0 = r17
            r1 = r18
            r2 = r21
            r0.add(r1, r2)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            return
        L6a:
            r19 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            goto L6d
        L6d:
            throw r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCaseMediatorRepository$1.onStart(androidx.lifecycle.PreferenceActivity):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onStop(PreferenceActivity preferenceActivity) {
        C1221c $r2 = this.f3685d;
        Object $r3 = $r2.f3691a;
        synchronized ($r3) {
            C1221c $r22 = this.f3685d;
            List $r4 = $r22.f3693c;
            $r4.remove(preferenceActivity);
            C1221c $r23 = this.f3685d;
            PreferenceActivity $r5 = $r23.d;
            if ($r5 == preferenceActivity) {
                C1221c $r24 = this.f3685d;
                List $r42 = $r24.f3693c;
                int $i0 = $r42.size();
                if ($i0 > 0) {
                    C1221c $r25 = this.f3685d;
                    C1221c $r6 = this.f3685d;
                    List $r43 = $r6.f3693c;
                    Object $r7 = $r43.get(0);
                    $r25.d = (PreferenceActivity) $r7;
                    C1221c $r26 = this.f3685d;
                    Map $r8 = $r26.f3692b;
                    C1221c $r27 = this.f3685d;
                    PreferenceActivity $r1 = $r27.d;
                    Object $r72 = $r8.get($r1);
                    UseCaseMediatorLifecycleController $r9 = (UseCaseMediatorLifecycleController) $r72;
                    C1236m $r10 = $r9.m36734a();
                    $r10.m36703c();
                    NullPointerException r12 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r12;
                }
                C1221c $r28 = this.f3685d;
                $r28.d = null;
            }
        }
    }
}
