package kotlin.p483e0.p485d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: SpreadBuilder.java */
/* renamed from: kotlin.e0.d.z */
/* loaded from: classes3.dex */
public class C11815z {

    /* renamed from: a */
    private final ArrayList<Object> f26501a;

    public C11815z(int i) {
        this.f26501a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void m10309a(Object obj) {
        this.f26501a.add(obj);
    }

    /* renamed from: b */
    public void m10308b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f26501a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f26501a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f26501a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f26501a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f26501a.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m10307c() {
        return this.f26501a.size();
    }

    /* renamed from: d */
    public Object[] m10306d(Object[] objArr) {
        return this.f26501a.toArray(objArr);
    }
}
