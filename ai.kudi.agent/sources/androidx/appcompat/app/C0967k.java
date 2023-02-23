package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1085d;
import androidx.appcompat.widget.C1097f;
import androidx.appcompat.widget.C1099g;
import androidx.appcompat.widget.C1122l;
import androidx.appcompat.widget.C1129o;
import androidx.appcompat.widget.C1130o0;
import androidx.appcompat.widget.C1131p;
import androidx.appcompat.widget.C1137r;
import androidx.appcompat.widget.C1143t;
import androidx.appcompat.widget.C1169x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p201g.p202a.C7461j;
import p201g.p202a.p209o.C7488d;
import p201g.p218e.C7534g;
import p201g.p227h.p238l.C7759x;
/* compiled from: AppCompatViewInflater.java */
/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes2.dex */
public class C0967k {

    /* renamed from: b */
    private static final Class<?>[] f2661b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f2662c = {16843375};

    /* renamed from: d */
    private static final String[] f2663d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C7534g<String, Constructor<? extends View>> f2664e = new C7534g<>();

    /* renamed from: a */
    private final Object[] f2665a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatViewInflater.java */
    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes2.dex */
    public static class View$OnClickListenerC0968a implements View.OnClickListener {

        /* renamed from: c */
        private final View f2666c;

        /* renamed from: d */
        private final String f2667d;

        /* renamed from: e */
        private Method f2668e;

        /* renamed from: f */
        private Context f2669f;

        public View$OnClickListenerC0968a(View view, String str) {
            this.f2666c = view;
            this.f2667d = str;
        }

        /* renamed from: a */
        private void m37660a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2667d, View.class)) != null) {
                        this.f2668e = method;
                        this.f2669f = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f2666c.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f2666c.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2667d + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2666c.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2668e == null) {
                m37660a(this.f2666c.getContext());
            }
            try {
                this.f2668e.invoke(this.f2669f, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m37676a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C7759x.m17540P(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2662c);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new View$OnClickListenerC0968a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: r */
    private View m37664r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends View> constructor = f2664e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2661b);
            f2664e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f2665a);
    }

    /* renamed from: s */
    private View m37663s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f2665a[0] = context;
            this.f2665a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < f2663d.length; i++) {
                    View m37664r = m37664r(context, str, f2663d[i]);
                    if (m37664r != null) {
                        return m37664r;
                    }
                }
                return null;
            }
            return m37664r(context, str, null);
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr = this.f2665a;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m37662t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C7461j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C7461j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C7488d) && ((C7488d) context).m18595c() == resourceId) ? context : new C7488d(context, resourceId) : context;
    }

    /* renamed from: u */
    private void m37661u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    protected C1085d mo26265b(Context context, AttributeSet attributeSet) {
        return new C1085d(context, attributeSet);
    }

    /* renamed from: c */
    protected AppCompatButton mo26264c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: d */
    protected C1097f mo26263d(Context context, AttributeSet attributeSet) {
        return new C1097f(context, attributeSet);
    }

    /* renamed from: e */
    protected C1099g m37675e(Context context, AttributeSet attributeSet) {
        return new C1099g(context, attributeSet);
    }

    /* renamed from: f */
    protected AppCompatEditText m37674f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: g */
    protected AppCompatImageButton m37673g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* renamed from: h */
    protected AppCompatImageView m37672h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: i */
    protected C1122l m37671i(Context context, AttributeSet attributeSet) {
        return new C1122l(context, attributeSet);
    }

    /* renamed from: j */
    protected C1129o mo26262j(Context context, AttributeSet attributeSet) {
        return new C1129o(context, attributeSet);
    }

    /* renamed from: k */
    protected C1131p m37670k(Context context, AttributeSet attributeSet) {
        return new C1131p(context, attributeSet);
    }

    /* renamed from: l */
    protected C1137r m37669l(Context context, AttributeSet attributeSet) {
        return new C1137r(context, attributeSet);
    }

    /* renamed from: m */
    protected C1143t m37668m(Context context, AttributeSet attributeSet) {
        return new C1143t(context, attributeSet);
    }

    /* renamed from: n */
    protected AppCompatTextView mo26261n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: o */
    protected C1169x m37667o(Context context, AttributeSet attributeSet) {
        return new C1169x(context, attributeSet);
    }

    /* renamed from: p */
    protected View m37666p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final View m37665q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View mo26261n;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m37662t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C1130o0.m37055b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\r';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo26261n = mo26261n(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 1:
                mo26261n = m37672h(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 2:
                mo26261n = mo26264c(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 3:
                mo26261n = m37674f(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 4:
                mo26261n = m37668m(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 5:
                mo26261n = m37673g(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 6:
                mo26261n = mo26263d(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 7:
                mo26261n = mo26262j(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case '\b':
                mo26261n = m37675e(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case '\t':
                mo26261n = mo26265b(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case '\n':
                mo26261n = m37671i(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case 11:
                mo26261n = m37670k(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case '\f':
                mo26261n = m37669l(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            case '\r':
                mo26261n = m37667o(context2, attributeSet);
                m37661u(mo26261n, str);
                break;
            default:
                mo26261n = m37666p(context2, str, attributeSet);
                break;
        }
        if (mo26261n == null && context != context2) {
            mo26261n = m37663s(context2, str, attributeSet);
        }
        if (mo26261n != null) {
            m37676a(mo26261n, attributeSet);
        }
        return mo26261n;
    }
}
