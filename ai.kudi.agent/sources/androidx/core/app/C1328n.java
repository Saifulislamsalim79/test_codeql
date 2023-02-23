package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: Person.java */
/* renamed from: androidx.core.app.n */
/* loaded from: classes2.dex */
public class C1328n {

    /* renamed from: a */
    CharSequence f4173a;

    /* renamed from: b */
    IconCompat f4174b;

    /* renamed from: c */
    String f4175c;

    /* renamed from: d */
    String f4176d;

    /* renamed from: e */
    boolean f4177e;

    /* renamed from: f */
    boolean f4178f;

    /* renamed from: a */
    public IconCompat m36354a() {
        return this.f4174b;
    }

    /* renamed from: b */
    public String m36353b() {
        return this.f4176d;
    }

    /* renamed from: c */
    public CharSequence m36352c() {
        return this.f4173a;
    }

    /* renamed from: d */
    public String m36351d() {
        return this.f4175c;
    }

    /* renamed from: e */
    public boolean m36350e() {
        return this.f4177e;
    }

    /* renamed from: f */
    public boolean m36349f() {
        return this.f4178f;
    }

    /* renamed from: g */
    public String m36348g() {
        String str = this.f4175c;
        if (str != null) {
            return str;
        }
        if (this.f4173a != null) {
            return "name:" + ((Object) this.f4173a);
        }
        return "";
    }

    /* renamed from: h */
    public Person m36347h() {
        return new Person.Builder().setName(m36352c()).setIcon(m36354a() != null ? m36354a().m36204p() : null).setUri(m36351d()).setKey(m36353b()).setBot(m36350e()).setImportant(m36349f()).build();
    }
}
