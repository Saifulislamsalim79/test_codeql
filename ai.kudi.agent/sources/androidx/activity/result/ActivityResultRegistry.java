package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.p053f.AbstractC0908a;
import androidx.core.app.C1297b;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes2.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f2387a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f2388b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f2389c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0900d> f2390d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f2391e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0899c<?>> f2392f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f2393g = new HashMap();

    /* renamed from: h */
    final Bundle f2394h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes2.dex */
    public class C0897a extends AbstractC0904c<I> {

        /* renamed from: a */
        final /* synthetic */ String f2399a;

        /* renamed from: b */
        final /* synthetic */ int f2400b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0908a f2401c;

        C0897a(String str, int i, AbstractC0908a abstractC0908a) {
            this.f2399a = str;
            this.f2400b = i;
            this.f2401c = abstractC0908a;
        }

        @Override // androidx.activity.result.AbstractC0904c
        /* renamed from: b */
        public void mo36016b(I i, C1297b c1297b) {
            ActivityResultRegistry.this.f2391e.add(this.f2399a);
            Integer num = ActivityResultRegistry.this.f2389c.get(this.f2399a);
            ActivityResultRegistry.this.mo37867f(num != null ? num.intValue() : this.f2400b, this.f2401c, i, c1297b);
        }

        @Override // androidx.activity.result.AbstractC0904c
        /* renamed from: c */
        public void mo36015c() {
            ActivityResultRegistry.this.m37861l(this.f2399a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes2.dex */
    public class C0898b extends AbstractC0904c<I> {

        /* renamed from: a */
        final /* synthetic */ String f2403a;

        /* renamed from: b */
        final /* synthetic */ int f2404b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0908a f2405c;

        C0898b(String str, int i, AbstractC0908a abstractC0908a) {
            this.f2403a = str;
            this.f2404b = i;
            this.f2405c = abstractC0908a;
        }

        @Override // androidx.activity.result.AbstractC0904c
        /* renamed from: b */
        public void mo36016b(I i, C1297b c1297b) {
            ActivityResultRegistry.this.f2391e.add(this.f2403a);
            Integer num = ActivityResultRegistry.this.f2389c.get(this.f2403a);
            ActivityResultRegistry.this.mo37867f(num != null ? num.intValue() : this.f2404b, this.f2405c, i, c1297b);
        }

        @Override // androidx.activity.result.AbstractC0904c
        /* renamed from: c */
        public void mo36015c() {
            ActivityResultRegistry.this.m37861l(this.f2403a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes2.dex */
    public static class C0899c<O> {

        /* renamed from: a */
        final InterfaceC0903b<O> f2407a;

        /* renamed from: b */
        final AbstractC0908a<?, O> f2408b;

        C0899c(InterfaceC0903b<O> interfaceC0903b, AbstractC0908a<?, O> abstractC0908a) {
            this.f2407a = interfaceC0903b;
            this.f2408b = abstractC0908a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes2.dex */
    public static class C0900d {

        /* renamed from: a */
        final AbstractC1565i f2409a;

        /* renamed from: b */
        private final ArrayList<InterfaceC1572l> f2410b = new ArrayList<>();

        C0900d(AbstractC1565i abstractC1565i) {
            this.f2409a = abstractC1565i;
        }

        /* renamed from: a */
        void m37860a(InterfaceC1572l interfaceC1572l) {
            this.f2409a.mo35506a(interfaceC1572l);
            this.f2410b.add(interfaceC1572l);
        }

        /* renamed from: b */
        void m37859b() {
            Iterator<InterfaceC1572l> it = this.f2410b.iterator();
            while (it.hasNext()) {
                this.f2409a.mo35504c(it.next());
            }
            this.f2410b.clear();
        }
    }

    /* renamed from: a */
    private void m37872a(int i, String str) {
        this.f2388b.put(Integer.valueOf(i), str);
        this.f2389c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private <O> void m37869d(String str, int i, Intent intent, C0899c<O> c0899c) {
        InterfaceC0903b<O> interfaceC0903b;
        if (c0899c != null && (interfaceC0903b = c0899c.f2407a) != null) {
            interfaceC0903b.mo35879a(c0899c.f2408b.mo35876c(i, intent));
            return;
        }
        this.f2393g.remove(str);
        this.f2394h.putParcelable(str, new C0901a(i, intent));
    }

    /* renamed from: e */
    private int m37868e() {
        int nextInt = this.f2387a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f2388b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f2387a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private int m37862k(String str) {
        Integer num = this.f2389c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int m37868e = m37868e();
        m37872a(m37868e, str);
        return m37868e;
    }

    /* renamed from: b */
    public final boolean m37871b(int i, int i2, Intent intent) {
        String str = this.f2388b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f2391e.remove(str);
        m37869d(str, i2, intent, this.f2392f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m37870c(int i, O o) {
        InterfaceC0903b<?> interfaceC0903b;
        String str = this.f2388b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f2391e.remove(str);
        C0899c<?> c0899c = this.f2392f.get(str);
        if (c0899c != null && (interfaceC0903b = c0899c.f2407a) != null) {
            interfaceC0903b.mo35879a(o);
            return true;
        }
        this.f2394h.remove(str);
        this.f2393g.put(str, o);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo37867f(int i, AbstractC0908a<I, O> abstractC0908a, I i2, C1297b c1297b);

    /* renamed from: g */
    public final void m37866g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f2391e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f2387a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f2394h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f2389c.containsKey(str)) {
                Integer remove = this.f2389c.remove(str);
                if (!this.f2394h.containsKey(str)) {
                    this.f2388b.remove(remove);
                }
            }
            m37872a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    /* renamed from: h */
    public final void m37865h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f2389c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f2389c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f2391e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f2394h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f2387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <I, O> AbstractC0904c<I> m37864i(String str, AbstractC0908a<I, O> abstractC0908a, InterfaceC0903b<O> interfaceC0903b) {
        int m37862k = m37862k(str);
        this.f2392f.put(str, new C0899c<>(interfaceC0903b, abstractC0908a));
        if (this.f2393g.containsKey(str)) {
            Object obj = this.f2393g.get(str);
            this.f2393g.remove(str);
            interfaceC0903b.mo35879a(obj);
        }
        C0901a c0901a = (C0901a) this.f2394h.getParcelable(str);
        if (c0901a != null) {
            this.f2394h.remove(str);
            interfaceC0903b.mo35879a(abstractC0908a.mo35876c(c0901a.m37857b(), c0901a.m37858a()));
        }
        return new C0898b(str, m37862k, abstractC0908a);
    }

    /* renamed from: j */
    public final <I, O> AbstractC0904c<I> m37863j(final String str, o oVar, final AbstractC0908a<I, O> abstractC0908a, final InterfaceC0903b<O> interfaceC0903b) {
        AbstractC1565i lifecycle = oVar.getLifecycle();
        if (!lifecycle.mo35505b().a(AbstractC1565i.c.f)) {
            int m37862k = m37862k(str);
            C0900d c0900d = this.f2390d.get(str);
            if (c0900d == null) {
                c0900d = new C0900d(lifecycle);
            }
            c0900d.m37860a(new InterfaceC1572l() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.InterfaceC1572l
                /* renamed from: m */
                public void mo34271m(o oVar2, AbstractC1565i.b bVar) {
                    if (AbstractC1565i.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f2392f.put(str, new C0899c<>(interfaceC0903b, abstractC0908a));
                        if (ActivityResultRegistry.this.f2393g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f2393g.get(str);
                            ActivityResultRegistry.this.f2393g.remove(str);
                            interfaceC0903b.mo35879a(obj);
                        }
                        C0901a c0901a = (C0901a) ActivityResultRegistry.this.f2394h.getParcelable(str);
                        if (c0901a != null) {
                            ActivityResultRegistry.this.f2394h.remove(str);
                            interfaceC0903b.mo35879a(abstractC0908a.mo35876c(c0901a.m37857b(), c0901a.m37858a()));
                        }
                    } else if (AbstractC1565i.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f2392f.remove(str);
                    } else if (AbstractC1565i.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.m37861l(str);
                    }
                }
            });
            this.f2390d.put(str, c0900d);
            return new C0897a(str, m37862k, abstractC0908a);
        }
        throw new IllegalStateException("LifecycleOwner " + oVar + " is attempting to register while current state is " + lifecycle.mo35505b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: l */
    final void m37861l(String str) {
        Integer remove;
        if (!this.f2391e.contains(str) && (remove = this.f2389c.remove(str)) != null) {
            this.f2388b.remove(remove);
        }
        this.f2392f.remove(str);
        if (this.f2393g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f2393g.get(str));
            this.f2393g.remove(str);
        }
        if (this.f2394h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f2394h.getParcelable(str));
            this.f2394h.remove(str);
        }
        C0900d c0900d = this.f2390d.get(str);
        if (c0900d != null) {
            c0900d.m37859b();
            this.f2390d.remove(str);
        }
    }
}
