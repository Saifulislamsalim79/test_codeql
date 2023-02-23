package ai.kudi.agent.savings.data.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13715n;
/* compiled from: SafeLet.kt */
@Metadata(m10422d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00020\u0006\"\u0004\u0018\u0001H\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0004\u0012\u0002H\u00040\b¢\u0006\u0002\u0010\n\u001aa\u0010\u000b\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\f*\u00020\u0003\"\b\b\u0001\u0010\r*\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u0001H\f2\b\u0010\u000f\u001a\u0004\u0018\u0001H\r2\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a{\u0010\u000b\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\f*\u00020\u0003\"\b\b\u0001\u0010\r*\u00020\u0003\"\b\b\u0002\u0010\u0012*\u00020\u0003\"\b\b\u0003\u0010\u0004*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u0001H\f2\b\u0010\u000f\u001a\u0004\u0018\u0001H\r2\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00122 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m10421d2 = {"allSafeLet", "", "T", "", "R", "options", "", "block", "Lkotlin/Function1;", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "safeLet", "T1", "T2", "p1", "p2", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "T3", "p3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "feature-savings_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SafeLetKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void allSafeLet(Object[] objArr, InterfaceC11767l interfaceC11767l) {
        List $r2;
        Log_OC.getArray(objArr, "options");
        Log_OC.getArray(interfaceC11767l, "block");
        int $i0 = objArr.length;
        boolean $z0 = false;
        int $i1 = 0;
        while (true) {
            if ($i1 >= $i0) {
                $z0 = true;
                break;
            }
            Object $r1 = objArr[$i1];
            boolean $z1 = $r1 != null;
            if (!$z1) {
                break;
            }
            $i1++;
        }
        if ($z0) {
            $r2 = C13715n.m4004u(objArr);
            interfaceC11767l.invoke($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Object safeLet(Object obj, Object obj2, Object obj3, InterfaceC11772q interfaceC11772q) {
        Log_OC.getArray(interfaceC11772q, "block");
        if (obj == null || obj2 == null || obj3 == null) {
            return null;
        }
        Object $r3 = interfaceC11772q.invoke(obj, obj2, obj3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Object safeLet(Object obj, Object obj2, InterfaceC11771p interfaceC11771p) {
        Log_OC.getArray(interfaceC11771p, "block");
        if (obj == null || obj2 == null) {
            return null;
        }
        Object $r2 = interfaceC11771p.invoke(obj, obj2);
        return $r2;
    }
}
