package tcking.github.com.giraffeplayer2;

import android.app.Activity;
import android.view.WindowManager;
import androidx.appcompat.app.AbstractC0925a;
/* compiled from: UIHelper.java */
/* renamed from: tcking.github.com.giraffeplayer2.o */
/* loaded from: classes3.dex */
public class C14905o {

    /* renamed from: a */
    private Activity f33349a;

    public C14905o(Activity activity) {
        this.f33349a = activity;
    }

    /* renamed from: d */
    public static C14905o m39d(Activity activity) {
        return new C14905o(activity);
    }

    /* renamed from: a */
    public C14905o m42a(boolean z) {
        Activity activity = this.f33349a;
        if (activity == null) {
            return this;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (z) {
            attributes.flags |= 1024;
            this.f33349a.getWindow().setAttributes(attributes);
        } else {
            attributes.flags &= -1025;
            this.f33349a.getWindow().setAttributes(attributes);
        }
        return this;
    }

    /* renamed from: b */
    public C14905o m41b(int i) {
        Activity activity = this.f33349a;
        if (activity == null) {
            return this;
        }
        activity.setRequestedOrientation(i);
        return this;
    }

    /* renamed from: c */
    public C14905o m40c(boolean z) {
        AbstractC0925a supportActionBar;
        androidx.appcompat.app.e eVar = this.f33349a;
        if (eVar != null && (eVar instanceof androidx.appcompat.app.e) && (supportActionBar = eVar.getSupportActionBar()) != null) {
            try {
                supportActionBar.mo37632B(false);
            } catch (Exception unused) {
            }
            if (z) {
                supportActionBar.mo37629E();
            } else {
                supportActionBar.mo37607l();
            }
        }
        return this;
    }
}
