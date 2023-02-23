package p201g.p266v;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TransitionValues.java */
/* renamed from: g.v.s */
/* loaded from: classes2.dex */
public class C8177s {

    /* renamed from: b */
    public View f19628b;

    /* renamed from: a */
    public final Map<String, Object> f19627a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC8160m> f19629c = new ArrayList<>();

    @Deprecated
    public C8177s() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8177s) {
            C8177s c8177s = (C8177s) obj;
            return this.f19628b == c8177s.f19628b && this.f19627a.equals(c8177s.f19627a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f19628b.hashCode() * 31) + this.f19627a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f19628b + "\n") + "    values:";
        for (String str2 : this.f19627a.keySet()) {
            str = str + "    " + str2 + ": " + this.f19627a.get(str2) + "\n";
        }
        return str;
    }

    public C8177s(View view) {
        this.f19628b = view;
    }
}
