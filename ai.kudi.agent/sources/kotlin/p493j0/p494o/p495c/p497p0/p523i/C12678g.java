package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
/* compiled from: MemberComparator.java */
/* renamed from: kotlin.j0.o.c.p0.i.g */
/* loaded from: classes3.dex */
public class C12678g implements Comparator<InterfaceC13513m> {

    /* renamed from: c */
    public static final C12678g f28537c = new C12678g();

    private C12678g() {
    }

    /* renamed from: b */
    private static Integer m6998b(InterfaceC13513m interfaceC13513m, InterfaceC13513m interfaceC13513m2) {
        int m6997c = m6997c(interfaceC13513m2) - m6997c(interfaceC13513m);
        if (m6997c != 0) {
            return Integer.valueOf(m6997c);
        }
        if (C12673d.m7046B(interfaceC13513m) && C12673d.m7046B(interfaceC13513m2)) {
            return 0;
        }
        int compareTo = interfaceC13513m.mo5012b().compareTo(interfaceC13513m2.mo5012b());
        if (compareTo != 0) {
            return Integer.valueOf(compareTo);
        }
        return null;
    }

    /* renamed from: c */
    private static int m6997c(InterfaceC13513m interfaceC13513m) {
        if (C12673d.m7046B(interfaceC13513m)) {
            return 8;
        }
        if (interfaceC13513m instanceof InterfaceC13452l) {
            return 7;
        }
        if (interfaceC13513m instanceof InterfaceC13518o0) {
            return ((InterfaceC13518o0) interfaceC13513m).mo5056w0() == null ? 6 : 5;
        } else if (interfaceC13513m instanceof InterfaceC13554x) {
            return ((InterfaceC13554x) interfaceC13513m).mo5056w0() == null ? 4 : 3;
        } else if (interfaceC13513m instanceof InterfaceC13312e) {
            return 2;
        } else {
            return interfaceC13513m instanceof InterfaceC13559y0 ? 1 : 0;
        }
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(InterfaceC13513m interfaceC13513m, InterfaceC13513m interfaceC13513m2) {
        Integer m6998b = m6998b(interfaceC13513m, interfaceC13513m2);
        if (m6998b != null) {
            return m6998b.intValue();
        }
        return 0;
    }
}
