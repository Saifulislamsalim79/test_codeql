package p425j.p434c.p435a.p436u.p437e;

import p425j.p434c.p435a.C11182g;
import p425j.p434c.p435a.InterfaceC11203q;
import p425j.p434c.p435a.InterfaceC11205s;
import p425j.p434c.p435a.p436u.AbstractC11226b;
import p425j.p434c.p435a.p436u.p438f.C11241b;
import p425j.p434c.p435a.p436u.p438f.C11248i;
/* compiled from: ListItemSpanFactory.java */
/* renamed from: j.c.a.u.e.g */
/* loaded from: classes3.dex */
public class C11237g implements InterfaceC11205s {
    @Override // p425j.p434c.p435a.InterfaceC11205s
    /* renamed from: a */
    public Object mo11285a(C11182g c11182g, InterfaceC11203q interfaceC11203q) {
        if (AbstractC11226b.EnumC11227a.BULLET == AbstractC11226b.f25306a.m11393c(interfaceC11203q)) {
            return new C11241b(c11182g.m11438e(), AbstractC11226b.f25307b.m11393c(interfaceC11203q).intValue());
        }
        return new C11248i(c11182g.m11438e(), String.valueOf(AbstractC11226b.f25308c.m11393c(interfaceC11203q)) + ". ");
    }
}
