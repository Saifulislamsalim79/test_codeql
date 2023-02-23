package p201g.p266v;

import android.view.ViewGroup;
/* compiled from: Scene.java */
/* renamed from: g.v.l */
/* loaded from: classes2.dex */
public class C8158l {

    /* renamed from: a */
    private ViewGroup f19564a;

    /* renamed from: b */
    private Runnable f19565b;

    /* renamed from: b */
    public static C8158l m16657b(ViewGroup viewGroup) {
        return (C8158l) viewGroup.getTag(C8151j.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m16656c(ViewGroup viewGroup, C8158l c8158l) {
        viewGroup.setTag(C8151j.transition_current_scene, c8158l);
    }

    /* renamed from: a */
    public void m16658a() {
        Runnable runnable;
        if (m16657b(this.f19564a) != this || (runnable = this.f19565b) == null) {
            return;
        }
        runnable.run();
    }
}
