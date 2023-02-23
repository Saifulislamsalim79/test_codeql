package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.C5743g;
import com.google.firebase.database.p131s.InterfaceC5829k;
import com.google.firebase.database.p138t.C5899c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: EventRaiser.java */
/* renamed from: com.google.firebase.database.s.j0.g */
/* loaded from: classes2.dex */
public class C5809g {

    /* renamed from: a */
    private final InterfaceC5829k f14265a;

    /* renamed from: b */
    private final C5899c f14266b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventRaiser.java */
    /* renamed from: com.google.firebase.database.s.j0.g$a */
    /* loaded from: classes2.dex */
    public class RunnableC5810a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f14267c;

        RunnableC5810a(ArrayList arrayList) {
            this.f14267c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f14267c.iterator();
            while (it.hasNext()) {
                InterfaceC5805e interfaceC5805e = (InterfaceC5805e) it.next();
                if (C5809g.this.f14266b.m23362f()) {
                    C5899c c5899c = C5809g.this.f14266b;
                    c5899c.m23366b("Raising " + interfaceC5805e.toString(), new Object[0]);
                }
                interfaceC5805e.mo23673a();
            }
        }
    }

    public C5809g(C5743g c5743g) {
        this.f14265a = c5743g.m23926n();
        this.f14266b = c5743g.m23924p("EventRaiser");
    }

    /* renamed from: b */
    public void m23665b(List<? extends InterfaceC5805e> list) {
        if (this.f14266b.m23362f()) {
            C5899c c5899c = this.f14266b;
            c5899c.m23366b("Raising " + list.size() + " event(s)", new Object[0]);
        }
        this.f14265a.mo23595b(new RunnableC5810a(new ArrayList(list)));
    }
}
