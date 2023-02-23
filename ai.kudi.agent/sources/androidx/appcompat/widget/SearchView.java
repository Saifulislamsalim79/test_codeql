package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p201g.p202a.C7452a;
import p201g.p202a.C7455d;
import p201g.p202a.C7457f;
import p201g.p202a.C7458g;
import p201g.p202a.C7459h;
import p201g.p202a.C7461j;
import p201g.p202a.p209o.InterfaceC7487c;
import p201g.p227h.p238l.C7759x;
import p201g.p241i.p242a.AbstractC7775a;
import p201g.p243j.p244a.AbstractC7781a;
/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC7487c {

    /* renamed from: I0 */
    static final C1052n f3090I0;

    /* renamed from: A0 */
    private Runnable f3091A0;

    /* renamed from: B0 */
    private final WeakHashMap<String, Drawable.ConstantState> f3092B0;

    /* renamed from: C0 */
    private final View.OnClickListener f3093C0;

    /* renamed from: D0 */
    View.OnKeyListener f3094D0;

    /* renamed from: E0 */
    private final TextView.OnEditorActionListener f3095E0;

    /* renamed from: F0 */
    private final AdapterView.OnItemClickListener f3096F0;

    /* renamed from: G0 */
    private final AdapterView.OnItemSelectedListener f3097G0;

    /* renamed from: H */
    final SearchAutoComplete f3098H;

    /* renamed from: H0 */
    private TextWatcher f3099H0;

    /* renamed from: I */
    private final View f3100I;

    /* renamed from: J */
    private final View f3101J;

    /* renamed from: K */
    private final View f3102K;

    /* renamed from: L */
    final ImageView f3103L;

    /* renamed from: M */
    final ImageView f3104M;

    /* renamed from: N */
    final ImageView f3105N;

    /* renamed from: O */
    final ImageView f3106O;

    /* renamed from: P */
    private final View f3107P;

    /* renamed from: Q */
    private C1055p f3108Q;

    /* renamed from: R */
    private Rect f3109R;

    /* renamed from: S */
    private Rect f3110S;

    /* renamed from: T */
    private int[] f3111T;

    /* renamed from: U */
    private int[] f3112U;

    /* renamed from: V */
    private final ImageView f3113V;

    /* renamed from: W */
    private final Drawable f3114W;

    /* renamed from: a0 */
    private final int f3115a0;

    /* renamed from: b0 */
    private final int f3116b0;

    /* renamed from: c0 */
    private final Intent f3117c0;

    /* renamed from: d0 */
    private final Intent f3118d0;

    /* renamed from: e0 */
    private final CharSequence f3119e0;

    /* renamed from: f0 */
    private InterfaceC1050l f3120f0;

    /* renamed from: g0 */
    private InterfaceC1049k f3121g0;

    /* renamed from: h0 */
    View.OnFocusChangeListener f3122h0;

    /* renamed from: i0 */
    private InterfaceC1051m f3123i0;

    /* renamed from: j0 */
    private View.OnClickListener f3124j0;

    /* renamed from: k0 */
    private boolean f3125k0;

    /* renamed from: l0 */
    private boolean f3126l0;

    /* renamed from: m0 */
    AbstractC7775a f3127m0;

    /* renamed from: n0 */
    private boolean f3128n0;

    /* renamed from: o0 */
    private CharSequence f3129o0;

    /* renamed from: p0 */
    private boolean f3130p0;

    /* renamed from: q0 */
    private boolean f3131q0;

    /* renamed from: r0 */
    private int f3132r0;

    /* renamed from: s0 */
    private boolean f3133s0;

    /* renamed from: t0 */
    private CharSequence f3134t0;

    /* renamed from: u0 */
    private CharSequence f3135u0;

    /* renamed from: v0 */
    private boolean f3136v0;

    /* renamed from: w0 */
    private int f3137w0;

    /* renamed from: x0 */
    SearchableInfo f3138x0;

    /* renamed from: y0 */
    private Bundle f3139y0;

    /* renamed from: z0 */
    private final Runnable f3140z0;

    /* loaded from: classes2.dex */
    public static class SearchAutoComplete extends C1085d {

        /* renamed from: f */
        private int f3141f;

        /* renamed from: w */
        private SearchView f3142w;

        /* renamed from: x */
        private boolean f3143x;

        /* renamed from: y */
        final Runnable f3144y;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes2.dex */
        class RunnableC1038a implements Runnable {
            RunnableC1038a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m37326c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C7452a.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* renamed from: a */
        void m37328a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f3090I0.m37320c(this);
        }

        /* renamed from: b */
        boolean m37327b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: c */
        void m37326c() {
            if (this.f3143x) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3143x = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f3141f <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1085d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3143x) {
                removeCallbacks(this.f3144y);
                post(this.f3144y);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f3142w.m37341Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3142w.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f3142w.hasFocus() && getVisibility() == 0) {
                this.f3143x = true;
                if (SearchView.m37354M(getContext())) {
                    m37328a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f3143x = false;
                removeCallbacks(this.f3144y);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f3143x = false;
                removeCallbacks(this.f3144y);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f3143x = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f3142w = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f3141f = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f3144y = new RunnableC1038a();
            this.f3141f = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes2.dex */
    class C1039a implements TextWatcher {
        C1039a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m37342Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes2.dex */
    class RunnableC1040b implements Runnable {
        RunnableC1040b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m37335f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes2.dex */
    class RunnableC1041c implements Runnable {
        RunnableC1041c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7775a abstractC7775a = SearchView.this.f3127m0;
            if (abstractC7775a instanceof View$OnClickListenerC1123l0) {
                abstractC7775a.mo17430a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes2.dex */
    class View$OnFocusChangeListenerC1042d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1042d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f3122h0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes2.dex */
    class View$OnLayoutChangeListenerC1043e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC1043e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m37365B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC1044f implements View.OnClickListener {
        View$OnClickListenerC1044f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f3103L) {
                searchView.m37345V();
            } else if (view == searchView.f3105N) {
                searchView.m37349R();
            } else if (view == searchView.f3104M) {
                searchView.m37344W();
            } else if (view == searchView.f3106O) {
                searchView.m37340a0();
            } else if (view == searchView.f3098H) {
                searchView.m37359H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes2.dex */
    class View$OnKeyListenerC1045g implements View.OnKeyListener {
        View$OnKeyListenerC1045g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f3138x0 == null) {
                return false;
            }
            if (searchView.f3098H.isPopupShowing() && SearchView.this.f3098H.getListSelection() != -1) {
                return SearchView.this.m37343X(view, i, keyEvent);
            }
            if (!SearchView.this.f3098H.m37327b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.m37351P(0, null, searchView2.f3098H.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes2.dex */
    class C1046h implements TextView.OnEditorActionListener {
        C1046h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m37344W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes2.dex */
    class C1047i implements AdapterView.OnItemClickListener {
        C1047i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m37348S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes2.dex */
    class C1048j implements AdapterView.OnItemSelectedListener {
        C1048j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m37347T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes2.dex */
    public interface InterfaceC1049k {
        /* renamed from: a */
        boolean m37325a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes2.dex */
    public interface InterfaceC1050l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes2.dex */
    public interface InterfaceC1051m {
        /* renamed from: a */
        boolean m37324a(int i);

        /* renamed from: b */
        boolean m37323b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes2.dex */
    public static class C1052n {

        /* renamed from: a */
        private Method f3156a;

        /* renamed from: b */
        private Method f3157b;

        /* renamed from: c */
        private Method f3158c;

        C1052n() {
            this.f3156a = null;
            this.f3157b = null;
            this.f3158c = null;
            m37319d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f3156a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f3157b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f3158c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m37319d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m37322a(AutoCompleteTextView autoCompleteTextView) {
            m37319d();
            Method method = this.f3157b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m37321b(AutoCompleteTextView autoCompleteTextView) {
            m37319d();
            Method method = this.f3156a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m37320c(AutoCompleteTextView autoCompleteTextView) {
            m37319d();
            Method method = this.f3158c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes2.dex */
    public static class C1053o extends AbstractC7781a {
        public static final Parcelable.Creator<C1053o> CREATOR = new C1054a();

        /* renamed from: e */
        boolean f3159e;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: classes2.dex */
        class C1054a implements Parcelable.ClassLoaderCreator<C1053o> {
            C1054a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1053o createFromParcel(Parcel parcel) {
                return new C1053o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1053o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1053o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1053o[] newArray(int i) {
                return new C1053o[i];
            }
        }

        C1053o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3159e + "}";
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f3159e));
        }

        public C1053o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3159e = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes2.dex */
    private static class C1055p extends TouchDelegate {

        /* renamed from: a */
        private final View f3160a;

        /* renamed from: b */
        private final Rect f3161b;

        /* renamed from: c */
        private final Rect f3162c;

        /* renamed from: d */
        private final Rect f3163d;

        /* renamed from: e */
        private final int f3164e;

        /* renamed from: f */
        private boolean f3165f;

        public C1055p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f3164e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f3161b = new Rect();
            this.f3163d = new Rect();
            this.f3162c = new Rect();
            m37315a(rect, rect2);
            this.f3160a = view;
        }

        /* renamed from: a */
        public void m37315a(Rect rect, Rect rect2) {
            this.f3161b.set(rect);
            this.f3163d.set(rect);
            Rect rect3 = this.f3163d;
            int i = this.f3164e;
            rect3.inset(-i, -i);
            this.f3162c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f3165f;
                    if (z2 && !this.f3163d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f3165f;
                        this.f3165f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f3161b.contains(x, y)) {
                    this.f3165f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (z && !this.f3162c.contains(x, y)) {
                    motionEvent.setLocation(this.f3160a.getWidth() / 2, this.f3160a.getHeight() / 2);
                } else {
                    Rect rect = this.f3162c;
                    motionEvent.setLocation(x - rect.left, y - rect.top);
                }
                return this.f3160a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f3090I0 = Build.VERSION.SDK_INT < 29 ? new C1052n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private Intent m37364C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3135u0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3139y0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f3138x0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m37363D(Cursor cursor, int i, String str) {
        int i2;
        String m37080o;
        try {
            String m37080o2 = View$OnClickListenerC1123l0.m37080o(cursor, "suggest_intent_action");
            if (m37080o2 == null) {
                m37080o2 = this.f3138x0.getSuggestIntentAction();
            }
            if (m37080o2 == null) {
                m37080o2 = "android.intent.action.SEARCH";
            }
            String str2 = m37080o2;
            String m37080o3 = View$OnClickListenerC1123l0.m37080o(cursor, "suggest_intent_data");
            if (m37080o3 == null) {
                m37080o3 = this.f3138x0.getSuggestIntentData();
            }
            if (m37080o3 != null && (m37080o = View$OnClickListenerC1123l0.m37080o(cursor, "suggest_intent_data_id")) != null) {
                m37080o3 = m37080o3 + "/" + Uri.encode(m37080o);
            }
            return m37364C(str2, m37080o3 == null ? null : Uri.parse(m37080o3), View$OnClickListenerC1123l0.m37080o(cursor, "suggest_intent_extra_data"), View$OnClickListenerC1123l0.m37080o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m37362E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3139y0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m37361F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m37360G() {
        this.f3098H.dismissDropDown();
    }

    /* renamed from: I */
    private void m37358I(View view, Rect rect) {
        view.getLocationInWindow(this.f3111T);
        getLocationInWindow(this.f3112U);
        int[] iArr = this.f3111T;
        int i = iArr[1];
        int[] iArr2 = this.f3112U;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m37357J(CharSequence charSequence) {
        if (!this.f3125k0 || this.f3114W == null) {
            return charSequence;
        }
        double textSize = this.f3098H.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f3114W.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f3114W), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m37356K() {
        SearchableInfo searchableInfo = this.f3138x0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f3138x0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f3117c0;
        } else if (this.f3138x0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f3118d0;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m37354M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m37353N() {
        return (this.f3128n0 || this.f3133s0) && !m37355L();
    }

    /* renamed from: O */
    private void m37352O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e("SearchView", "Failed launch activity: " + intent, e);
        }
    }

    /* renamed from: Q */
    private boolean m37350Q(int i, int i2, String str) {
        Cursor mo17429b = this.f3127m0.mo17429b();
        if (mo17429b == null || !mo17429b.moveToPosition(i)) {
            return false;
        }
        m37352O(m37363D(mo17429b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m37339b0() {
        post(this.f3140z0);
    }

    /* renamed from: c0 */
    private void m37338c0(int i) {
        Editable text = this.f3098H.getText();
        Cursor mo17429b = this.f3127m0.mo17429b();
        if (mo17429b == null) {
            return;
        }
        if (mo17429b.moveToPosition(i)) {
            CharSequence mo17428c = this.f3127m0.mo17428c(mo17429b);
            if (mo17428c != null) {
                setQuery(mo17428c);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    /* renamed from: e0 */
    private void m37336e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3098H.getText());
        if (!z2 && (!this.f3125k0 || this.f3136v0)) {
            z = false;
        }
        this.f3105N.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f3105N.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m37334g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f3098H;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m37357J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C7455d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C7455d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m37333h0() {
        this.f3098H.setThreshold(this.f3138x0.getSuggestThreshold());
        this.f3098H.setImeOptions(this.f3138x0.getImeOptions());
        int inputType = this.f3138x0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3138x0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f3098H.setInputType(inputType);
        AbstractC7775a abstractC7775a = this.f3127m0;
        if (abstractC7775a != null) {
            abstractC7775a.mo17430a(null);
        }
        if (this.f3138x0.getSuggestAuthority() != null) {
            View$OnClickListenerC1123l0 view$OnClickListenerC1123l0 = new View$OnClickListenerC1123l0(getContext(), this, this.f3138x0, this.f3092B0);
            this.f3127m0 = view$OnClickListenerC1123l0;
            this.f3098H.setAdapter(view$OnClickListenerC1123l0);
            ((View$OnClickListenerC1123l0) this.f3127m0).m37071x(this.f3130p0 ? 2 : 1);
        }
    }

    /* renamed from: i0 */
    private void m37332i0() {
        this.f3102K.setVisibility((m37353N() && (this.f3104M.getVisibility() == 0 || this.f3106O.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: j0 */
    private void m37331j0(boolean z) {
        this.f3104M.setVisibility((this.f3128n0 && m37353N() && hasFocus() && (z || !this.f3133s0)) ? 0 : 8);
    }

    /* renamed from: k0 */
    private void m37330k0(boolean z) {
        this.f3126l0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f3098H.getText());
        this.f3103L.setVisibility(i2);
        m37331j0(z2);
        this.f3100I.setVisibility(z ? 8 : 0);
        this.f3113V.setVisibility((this.f3113V.getDrawable() == null || this.f3125k0) ? 8 : 8);
        m37336e0();
        m37329l0(!z2);
        m37332i0();
    }

    /* renamed from: l0 */
    private void m37329l0(boolean z) {
        int i = 8;
        if (this.f3133s0 && !m37355L() && z) {
            this.f3104M.setVisibility(8);
            i = 0;
        }
        this.f3106O.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f3098H.setText(charSequence);
        this.f3098H.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: B */
    void m37365B() {
        int i;
        if (this.f3107P.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f3101J.getPaddingLeft();
            Rect rect = new Rect();
            boolean m36903b = C1170x0.m36903b(this);
            int dimensionPixelSize = this.f3125k0 ? resources.getDimensionPixelSize(C7455d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C7455d.abc_dropdownitem_text_padding_left) : 0;
            this.f3098H.getDropDownBackground().getPadding(rect);
            if (m36903b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f3098H.setDropDownHorizontalOffset(i);
            this.f3098H.setDropDownWidth((((this.f3107P.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: H */
    void m37359H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3098H.refreshAutoCompleteResults();
            return;
        }
        f3090I0.m37321b(this.f3098H);
        f3090I0.m37322a(this.f3098H);
    }

    /* renamed from: L */
    public boolean m37355L() {
        return this.f3126l0;
    }

    /* renamed from: P */
    void m37351P(int i, String str, String str2) {
        getContext().startActivity(m37364C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: R */
    void m37349R() {
        if (TextUtils.isEmpty(this.f3098H.getText())) {
            if (this.f3125k0) {
                InterfaceC1049k interfaceC1049k = this.f3121g0;
                if (interfaceC1049k == null || !interfaceC1049k.m37325a()) {
                    clearFocus();
                    m37330k0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f3098H.setText("");
        this.f3098H.requestFocus();
        this.f3098H.setImeVisibility(true);
    }

    /* renamed from: S */
    boolean m37348S(int i, int i2, String str) {
        InterfaceC1051m interfaceC1051m = this.f3123i0;
        if (interfaceC1051m == null || !interfaceC1051m.m37323b(i)) {
            m37350Q(i, 0, null);
            this.f3098H.setImeVisibility(false);
            m37360G();
            return true;
        }
        return false;
    }

    /* renamed from: T */
    boolean m37347T(int i) {
        InterfaceC1051m interfaceC1051m = this.f3123i0;
        if (interfaceC1051m == null || !interfaceC1051m.m37324a(i)) {
            m37338c0(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m37346U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    void m37345V() {
        m37330k0(false);
        this.f3098H.requestFocus();
        this.f3098H.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3124j0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    void m37344W() {
        Editable text = this.f3098H.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC1050l interfaceC1050l = this.f3120f0;
        if (interfaceC1050l == null || !interfaceC1050l.onQueryTextSubmit(text.toString())) {
            if (this.f3138x0 != null) {
                m37351P(0, null, text.toString());
            }
            this.f3098H.setImeVisibility(false);
            m37360G();
        }
    }

    /* renamed from: X */
    boolean m37343X(View view, int i, KeyEvent keyEvent) {
        if (this.f3138x0 != null && this.f3127m0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m37348S(this.f3098H.getListSelection(), 0, null);
            }
            if (i != 21 && i != 22) {
                if (i != 19 || this.f3098H.getListSelection() == 0) {
                    return false;
                }
            } else {
                this.f3098H.setSelection(i == 21 ? 0 : this.f3098H.length());
                this.f3098H.setListSelection(0);
                this.f3098H.clearListSelection();
                this.f3098H.m37328a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    void m37342Y(CharSequence charSequence) {
        Editable text = this.f3098H.getText();
        this.f3135u0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m37331j0(z);
        m37329l0(!z);
        m37336e0();
        m37332i0();
        if (this.f3120f0 != null && !TextUtils.equals(charSequence, this.f3134t0)) {
            this.f3120f0.onQueryTextChange(charSequence.toString());
        }
        this.f3134t0 = charSequence.toString();
    }

    /* renamed from: Z */
    void m37341Z() {
        m37330k0(m37355L());
        m37339b0();
        if (this.f3098H.hasFocus()) {
            m37359H();
        }
    }

    /* renamed from: a0 */
    void m37340a0() {
        SearchableInfo searchableInfo = this.f3138x0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m37361F(this.f3117c0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m37362E(this.f3118d0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // p201g.p202a.p209o.InterfaceC7487c
    /* renamed from: c */
    public void mo18599c() {
        if (this.f3136v0) {
            return;
        }
        this.f3136v0 = true;
        int imeOptions = this.f3098H.getImeOptions();
        this.f3137w0 = imeOptions;
        this.f3098H.setImeOptions(imeOptions | 33554432);
        this.f3098H.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f3131q0 = true;
        super.clearFocus();
        this.f3098H.clearFocus();
        this.f3098H.setImeVisibility(false);
        this.f3131q0 = false;
    }

    /* renamed from: d0 */
    public void m37337d0(CharSequence charSequence, boolean z) {
        this.f3098H.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f3098H;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f3135u0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m37344W();
    }

    @Override // p201g.p202a.p209o.InterfaceC7487c
    /* renamed from: f */
    public void mo18598f() {
        m37337d0("", false);
        clearFocus();
        m37330k0(true);
        this.f3098H.setImeOptions(this.f3137w0);
        this.f3136v0 = false;
    }

    /* renamed from: f0 */
    void m37335f0() {
        int[] iArr = this.f3098H.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3101J.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3102K.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f3098H.getImeOptions();
    }

    public int getInputType() {
        return this.f3098H.getInputType();
    }

    public int getMaxWidth() {
        return this.f3132r0;
    }

    public CharSequence getQuery() {
        return this.f3098H.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3129o0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3138x0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.f3138x0.getHintId());
        }
        return this.f3119e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f3116b0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f3115a0;
    }

    public AbstractC7775a getSuggestionsAdapter() {
        return this.f3127m0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f3140z0);
        post(this.f3091A0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m37358I(this.f3098H, this.f3109R);
            Rect rect = this.f3110S;
            Rect rect2 = this.f3109R;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C1055p c1055p = this.f3108Q;
            if (c1055p == null) {
                C1055p c1055p2 = new C1055p(this.f3110S, this.f3109R, this.f3098H);
                this.f3108Q = c1055p2;
                setTouchDelegate(c1055p2);
                return;
            }
            c1055p.m37315a(this.f3110S, this.f3109R);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (m37355L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f3132r0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3132r0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f3132r0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1053o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1053o c1053o = (C1053o) parcelable;
        super.onRestoreInstanceState(c1053o.m17424a());
        m37330k0(c1053o.f3159e);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1053o c1053o = new C1053o(super.onSaveInstanceState());
        c1053o.f3159e = m37355L();
        return c1053o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m37339b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f3131q0 && isFocusable()) {
            if (!m37355L()) {
                boolean requestFocus = this.f3098H.requestFocus(i, rect);
                if (requestFocus) {
                    m37330k0(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3139y0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m37349R();
        } else {
            m37345V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f3125k0 == z) {
            return;
        }
        this.f3125k0 = z;
        m37330k0(z);
        m37334g0();
    }

    public void setImeOptions(int i) {
        this.f3098H.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f3098H.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f3132r0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC1049k interfaceC1049k) {
        this.f3121g0 = interfaceC1049k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3122h0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC1050l interfaceC1050l) {
        this.f3120f0 = interfaceC1050l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3124j0 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC1051m interfaceC1051m) {
        this.f3123i0 = interfaceC1051m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3129o0 = charSequence;
        m37334g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f3130p0 = z;
        AbstractC7775a abstractC7775a = this.f3127m0;
        if (abstractC7775a instanceof View$OnClickListenerC1123l0) {
            ((View$OnClickListenerC1123l0) abstractC7775a).m37071x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3138x0 = searchableInfo;
        if (searchableInfo != null) {
            m37333h0();
            m37334g0();
        }
        boolean m37356K = m37356K();
        this.f3133s0 = m37356K;
        if (m37356K) {
            this.f3098H.setPrivateImeOptions("nm");
        }
        m37330k0(m37355L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f3128n0 = z;
        m37330k0(m37355L());
    }

    public void setSuggestionsAdapter(AbstractC7775a abstractC7775a) {
        this.f3127m0 = abstractC7775a;
        this.f3098H.setAdapter(abstractC7775a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3109R = new Rect();
        this.f3110S = new Rect();
        this.f3111T = new int[2];
        this.f3112U = new int[2];
        this.f3140z0 = new RunnableC1040b();
        this.f3091A0 = new RunnableC1041c();
        this.f3092B0 = new WeakHashMap<>();
        this.f3093C0 = new View$OnClickListenerC1044f();
        this.f3094D0 = new View$OnKeyListenerC1045g();
        this.f3095E0 = new C1046h();
        this.f3096F0 = new C1047i();
        this.f3097G0 = new C1048j();
        this.f3099H0 = new C1039a();
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, C7461j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(m37026v.m37034n(C7461j.SearchView_layout, C7458g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C7457f.search_src_text);
        this.f3098H = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3100I = findViewById(C7457f.search_edit_frame);
        this.f3101J = findViewById(C7457f.search_plate);
        this.f3102K = findViewById(C7457f.submit_area);
        this.f3103L = (ImageView) findViewById(C7457f.search_button);
        this.f3104M = (ImageView) findViewById(C7457f.search_go_btn);
        this.f3105N = (ImageView) findViewById(C7457f.search_close_btn);
        this.f3106O = (ImageView) findViewById(C7457f.search_voice_btn);
        this.f3113V = (ImageView) findViewById(C7457f.search_mag_icon);
        C7759x.m17492s0(this.f3101J, m37026v.m37041g(C7461j.SearchView_queryBackground));
        C7759x.m17492s0(this.f3102K, m37026v.m37041g(C7461j.SearchView_submitBackground));
        this.f3103L.setImageDrawable(m37026v.m37041g(C7461j.SearchView_searchIcon));
        this.f3104M.setImageDrawable(m37026v.m37041g(C7461j.SearchView_goIcon));
        this.f3105N.setImageDrawable(m37026v.m37041g(C7461j.SearchView_closeIcon));
        this.f3106O.setImageDrawable(m37026v.m37041g(C7461j.SearchView_voiceIcon));
        this.f3113V.setImageDrawable(m37026v.m37041g(C7461j.SearchView_searchIcon));
        this.f3114W = m37026v.m37041g(C7461j.SearchView_searchHintIcon);
        C1155t0.m36986a(this.f3103L, getResources().getString(C7459h.abc_searchview_description_search));
        this.f3115a0 = m37026v.m37034n(C7461j.SearchView_suggestionRowLayout, C7458g.abc_search_dropdown_item_icons_2line);
        this.f3116b0 = m37026v.m37034n(C7461j.SearchView_commitIcon, 0);
        this.f3103L.setOnClickListener(this.f3093C0);
        this.f3105N.setOnClickListener(this.f3093C0);
        this.f3104M.setOnClickListener(this.f3093C0);
        this.f3106O.setOnClickListener(this.f3093C0);
        this.f3098H.setOnClickListener(this.f3093C0);
        this.f3098H.addTextChangedListener(this.f3099H0);
        this.f3098H.setOnEditorActionListener(this.f3095E0);
        this.f3098H.setOnItemClickListener(this.f3096F0);
        this.f3098H.setOnItemSelectedListener(this.f3097G0);
        this.f3098H.setOnKeyListener(this.f3094D0);
        this.f3098H.setOnFocusChangeListener(new View$OnFocusChangeListenerC1042d());
        setIconifiedByDefault(m37026v.m37047a(C7461j.SearchView_iconifiedByDefault, true));
        int m37042f = m37026v.m37042f(C7461j.SearchView_android_maxWidth, -1);
        if (m37042f != -1) {
            setMaxWidth(m37042f);
        }
        this.f3119e0 = m37026v.m37032p(C7461j.SearchView_defaultQueryHint);
        this.f3129o0 = m37026v.m37032p(C7461j.SearchView_queryHint);
        int m37037k = m37026v.m37037k(C7461j.SearchView_android_imeOptions, -1);
        if (m37037k != -1) {
            setImeOptions(m37037k);
        }
        int m37037k2 = m37026v.m37037k(C7461j.SearchView_android_inputType, -1);
        if (m37037k2 != -1) {
            setInputType(m37037k2);
        }
        setFocusable(m37026v.m37047a(C7461j.SearchView_android_focusable, true));
        m37026v.m37025w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3117c0 = intent;
        intent.addFlags(268435456);
        this.f3117c0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3118d0 = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f3098H.getDropDownAnchor());
        this.f3107P = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1043e());
        }
        m37330k0(this.f3125k0);
        m37334g0();
    }
}
