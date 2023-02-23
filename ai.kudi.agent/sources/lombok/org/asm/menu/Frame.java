package lombok.org.asm.menu;

import kotlin.C13666w;
import lombok.org.asm.AbstractC14311u;
/* loaded from: classes.dex */
public final class Frame extends AbstractC14311u {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14287i f31415a;

    /* renamed from: f */
    public final a.a.a.a2.n<?> f31416f;

    public Frame(AbstractC14287i abstractC14287i, AbstractC14291o abstractC14291o) {
        this.f31415a = abstractC14287i;
        this.f31416f = abstractC14291o;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.NavigationMenuPresenter
    /* renamed from: a */
    public void mo2257a(Throwable th) {
        boolean $z0 = this.f31416f.exists();
        if ($z0) {
            AbstractC14287i $r3 = this.f31415a;
            $r3.getClass();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public C13666w invoke(Throwable th) {
        boolean $z0 = this.f31416f.exists();
        if ($z0) {
            AbstractC14287i $r4 = this.f31415a;
            $r4.getClass();
        }
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        String $r1 = "RemoveReceiveOnCancel[" + this.f31416f + ']';
        return $r1;
    }
}
