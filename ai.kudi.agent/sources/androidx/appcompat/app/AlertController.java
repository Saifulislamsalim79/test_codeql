package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p201g.p202a.C7452a;
import p201g.p202a.C7457f;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f2422A;

    /* renamed from: C */
    private Drawable f2424C;

    /* renamed from: D */
    private ImageView f2425D;

    /* renamed from: E */
    private TextView f2426E;

    /* renamed from: F */
    private TextView f2427F;

    /* renamed from: G */
    private View f2428G;

    /* renamed from: H */
    ListAdapter f2429H;

    /* renamed from: J */
    private int f2431J;

    /* renamed from: K */
    private int f2432K;

    /* renamed from: L */
    int f2433L;

    /* renamed from: M */
    int f2434M;

    /* renamed from: N */
    int f2435N;

    /* renamed from: O */
    int f2436O;

    /* renamed from: P */
    private boolean f2437P;

    /* renamed from: R */
    Handler f2439R;

    /* renamed from: a */
    private final Context f2441a;

    /* renamed from: b */
    final DialogC0964i f2442b;

    /* renamed from: c */
    private final Window f2443c;

    /* renamed from: d */
    private final int f2444d;

    /* renamed from: e */
    private CharSequence f2445e;

    /* renamed from: f */
    private CharSequence f2446f;

    /* renamed from: g */
    ListView f2447g;

    /* renamed from: h */
    private View f2448h;

    /* renamed from: i */
    private int f2449i;

    /* renamed from: j */
    private int f2450j;

    /* renamed from: k */
    private int f2451k;

    /* renamed from: l */
    private int f2452l;

    /* renamed from: m */
    private int f2453m;

    /* renamed from: o */
    Button f2455o;

    /* renamed from: p */
    private CharSequence f2456p;

    /* renamed from: q */
    Message f2457q;

    /* renamed from: r */
    private Drawable f2458r;

    /* renamed from: s */
    Button f2459s;

    /* renamed from: t */
    private CharSequence f2460t;

    /* renamed from: u */
    Message f2461u;

    /* renamed from: v */
    private Drawable f2462v;

    /* renamed from: w */
    Button f2463w;

    /* renamed from: x */
    private CharSequence f2464x;

    /* renamed from: y */
    Message f2465y;

    /* renamed from: z */
    private Drawable f2466z;

    /* renamed from: n */
    private boolean f2454n = false;

    /* renamed from: B */
    private int f2423B = 0;

    /* renamed from: I */
    int f2430I = -1;

    /* renamed from: Q */
    private int f2438Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f2440S = new View$OnClickListenerC0912a();

    /* loaded from: classes2.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: c */
        private final int f2467c;

        /* renamed from: d */
        private final int f2468d;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.RecycleListView);
            this.f2468d = obtainStyledAttributes.getDimensionPixelOffset(C7461j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2467c = obtainStyledAttributes.getDimensionPixelOffset(C7461j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m37808a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f2467c, getPaddingRight(), z2 ? getPaddingBottom() : this.f2468d);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC0912a implements View.OnClickListener {
        View$OnClickListenerC0912a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f2455o && (message3 = alertController.f2457q) != null) {
                obtain = Message.obtain(message3);
            } else {
                AlertController alertController2 = AlertController.this;
                if (view == alertController2.f2459s && (message2 = alertController2.f2461u) != null) {
                    obtain = Message.obtain(message2);
                } else {
                    AlertController alertController3 = AlertController.this;
                    obtain = (view != alertController3.f2463w || (message = alertController3.f2465y) == null) ? null : Message.obtain(message);
                }
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController4 = AlertController.this;
            alertController4.f2439R.obtainMessage(1, alertController4.f2442b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes2.dex */
    public class C0913b implements NestedScrollView.InterfaceC1385b {

        /* renamed from: a */
        final /* synthetic */ View f2470a;

        /* renamed from: b */
        final /* synthetic */ View f2471b;

        C0913b(AlertController alertController, View view, View view2) {
            this.f2470a = view;
            this.f2471b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC1385b
        /* renamed from: a */
        public void mo36157a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m37828g(nestedScrollView, this.f2470a, this.f2471b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes2.dex */
    public class RunnableC0914c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f2472c;

        /* renamed from: d */
        final /* synthetic */ View f2473d;

        RunnableC0914c(View view, View view2) {
            this.f2472c = view;
            this.f2473d = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m37828g(AlertController.this.f2422A, this.f2472c, this.f2473d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes2.dex */
    public class C0915d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f2475a;

        /* renamed from: b */
        final /* synthetic */ View f2476b;

        C0915d(AlertController alertController, View view, View view2) {
            this.f2475a = view;
            this.f2476b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m37828g(absListView, this.f2475a, this.f2476b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes2.dex */
    public class RunnableC0916e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f2477c;

        /* renamed from: d */
        final /* synthetic */ View f2478d;

        RunnableC0916e(View view, View view2) {
            this.f2477c = view;
            this.f2478d = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m37828g(AlertController.this.f2447g, this.f2477c, this.f2478d);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes2.dex */
    public static class C0917f {

        /* renamed from: A */
        public int f2480A;

        /* renamed from: B */
        public int f2481B;

        /* renamed from: C */
        public int f2482C;

        /* renamed from: D */
        public int f2483D;

        /* renamed from: F */
        public boolean[] f2485F;

        /* renamed from: G */
        public boolean f2486G;

        /* renamed from: H */
        public boolean f2487H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f2489J;

        /* renamed from: K */
        public Cursor f2490K;

        /* renamed from: L */
        public String f2491L;

        /* renamed from: M */
        public String f2492M;

        /* renamed from: N */
        public boolean f2493N;

        /* renamed from: O */
        public AdapterView.OnItemSelectedListener f2494O;

        /* renamed from: P */
        public InterfaceC0922e f2495P;

        /* renamed from: Q */
        public boolean f2496Q;

        /* renamed from: a */
        public final Context f2497a;

        /* renamed from: b */
        public final LayoutInflater f2498b;

        /* renamed from: d */
        public Drawable f2500d;

        /* renamed from: f */
        public CharSequence f2502f;

        /* renamed from: g */
        public View f2503g;

        /* renamed from: h */
        public CharSequence f2504h;

        /* renamed from: i */
        public CharSequence f2505i;

        /* renamed from: j */
        public Drawable f2506j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f2507k;

        /* renamed from: l */
        public CharSequence f2508l;

        /* renamed from: m */
        public Drawable f2509m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f2510n;

        /* renamed from: o */
        public CharSequence f2511o;

        /* renamed from: p */
        public Drawable f2512p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f2513q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f2515s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f2516t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f2517u;

        /* renamed from: v */
        public CharSequence[] f2518v;

        /* renamed from: w */
        public ListAdapter f2519w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f2520x;

        /* renamed from: y */
        public int f2521y;

        /* renamed from: z */
        public View f2522z;

        /* renamed from: c */
        public int f2499c = 0;

        /* renamed from: e */
        public int f2501e = 0;

        /* renamed from: E */
        public boolean f2484E = false;

        /* renamed from: I */
        public int f2488I = -1;

        /* renamed from: r */
        public boolean f2514r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes2.dex */
        public class C0918a extends ArrayAdapter<CharSequence> {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f2523c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0918a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f2523c = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0917f.this.f2485F;
                if (zArr != null && zArr[i]) {
                    this.f2523c.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes2.dex */
        public class C0919b extends CursorAdapter {

            /* renamed from: c */
            private final int f2525c;

            /* renamed from: d */
            private final int f2526d;

            /* renamed from: e */
            final /* synthetic */ RecycleListView f2527e;

            /* renamed from: f */
            final /* synthetic */ AlertController f2528f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0919b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f2527e = recycleListView;
                this.f2528f = alertController;
                Cursor cursor2 = getCursor();
                this.f2525c = cursor2.getColumnIndexOrThrow(C0917f.this.f2491L);
                this.f2526d = cursor2.getColumnIndexOrThrow(C0917f.this.f2492M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2525c));
                this.f2527e.setItemChecked(cursor.getPosition(), cursor.getInt(this.f2526d) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0917f.this.f2498b.inflate(this.f2528f.f2434M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes2.dex */
        public class C0920c implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ AlertController f2530c;

            C0920c(AlertController alertController) {
                this.f2530c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0917f.this.f2520x.onClick(this.f2530c.f2442b, i);
                if (C0917f.this.f2487H) {
                    return;
                }
                this.f2530c.f2442b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes2.dex */
        public class C0921d implements AdapterView.OnItemClickListener {

            /* renamed from: c */
            final /* synthetic */ RecycleListView f2532c;

            /* renamed from: d */
            final /* synthetic */ AlertController f2533d;

            C0921d(RecycleListView recycleListView, AlertController alertController) {
                this.f2532c = recycleListView;
                this.f2533d = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0917f.this.f2485F;
                if (zArr != null) {
                    zArr[i] = this.f2532c.isItemChecked(i);
                }
                C0917f.this.f2489J.onClick(this.f2533d.f2442b, i, this.f2532c.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes2.dex */
        public interface InterfaceC0922e {
            /* renamed from: a */
            void m37805a(ListView listView);
        }

        public C0917f(Context context) {
            this.f2497a = context;
            this.f2498b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m37806b(AlertController alertController) {
            int i;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f2498b.inflate(alertController.f2433L, (ViewGroup) null);
            if (this.f2486G) {
                if (this.f2490K == null) {
                    listAdapter = new C0918a(this.f2497a, alertController.f2434M, 16908308, this.f2518v, recycleListView);
                } else {
                    listAdapter = new C0919b(this.f2497a, this.f2490K, false, recycleListView, alertController);
                }
            } else {
                if (this.f2487H) {
                    i = alertController.f2435N;
                } else {
                    i = alertController.f2436O;
                }
                int i2 = i;
                if (this.f2490K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f2497a, i2, this.f2490K, new String[]{this.f2491L}, new int[]{16908308});
                } else {
                    listAdapter = this.f2519w;
                    if (listAdapter == null) {
                        listAdapter = new C0924h(this.f2497a, i2, 16908308, this.f2518v);
                    }
                }
            }
            InterfaceC0922e interfaceC0922e = this.f2495P;
            if (interfaceC0922e != null) {
                interfaceC0922e.m37805a(recycleListView);
            }
            alertController.f2429H = listAdapter;
            alertController.f2430I = this.f2488I;
            if (this.f2520x != null) {
                recycleListView.setOnItemClickListener(new C0920c(alertController));
            } else if (this.f2489J != null) {
                recycleListView.setOnItemClickListener(new C0921d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2494O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f2487H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f2486G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f2447g = recycleListView;
        }

        /* renamed from: a */
        public void m37807a(AlertController alertController) {
            View view = this.f2503g;
            if (view != null) {
                alertController.m37822m(view);
            } else {
                CharSequence charSequence = this.f2502f;
                if (charSequence != null) {
                    alertController.m37817r(charSequence);
                }
                Drawable drawable = this.f2500d;
                if (drawable != null) {
                    alertController.m37820o(drawable);
                }
                int i = this.f2499c;
                if (i != 0) {
                    alertController.m37821n(i);
                }
                int i2 = this.f2501e;
                if (i2 != 0) {
                    alertController.m37821n(alertController.m37831d(i2));
                }
            }
            CharSequence charSequence2 = this.f2504h;
            if (charSequence2 != null) {
                alertController.m37819p(charSequence2);
            }
            if (this.f2505i != null || this.f2506j != null) {
                alertController.m37823l(-1, this.f2505i, this.f2507k, null, this.f2506j);
            }
            if (this.f2508l != null || this.f2509m != null) {
                alertController.m37823l(-2, this.f2508l, this.f2510n, null, this.f2509m);
            }
            if (this.f2511o != null || this.f2512p != null) {
                alertController.m37823l(-3, this.f2511o, this.f2513q, null, this.f2512p);
            }
            if (this.f2518v != null || this.f2490K != null || this.f2519w != null) {
                m37806b(alertController);
            }
            View view2 = this.f2522z;
            if (view2 != null) {
                if (this.f2484E) {
                    alertController.m37814u(view2, this.f2480A, this.f2481B, this.f2482C, this.f2483D);
                    return;
                } else {
                    alertController.m37815t(view2);
                    return;
                }
            }
            int i3 = this.f2521y;
            if (i3 != 0) {
                alertController.m37816s(i3);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes2.dex */
    private static final class HandlerC0923g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f2535a;

        public HandlerC0923g(DialogInterface dialogInterface) {
            this.f2535a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f2535a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes2.dex */
    public static class C0924h extends ArrayAdapter<CharSequence> {
        public C0924h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0964i dialogC0964i, Window window) {
        this.f2441a = context;
        this.f2442b = dialogC0964i;
        this.f2443c = window;
        this.f2439R = new HandlerC0923g(dialogC0964i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C7461j.AlertDialog, C7452a.alertDialogStyle, 0);
        this.f2431J = obtainStyledAttributes.getResourceId(C7461j.AlertDialog_android_layout, 0);
        this.f2432K = obtainStyledAttributes.getResourceId(C7461j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2433L = obtainStyledAttributes.getResourceId(C7461j.AlertDialog_listLayout, 0);
        this.f2434M = obtainStyledAttributes.getResourceId(C7461j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2435N = obtainStyledAttributes.getResourceId(C7461j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2436O = obtainStyledAttributes.getResourceId(C7461j.AlertDialog_listItemLayout, 0);
        this.f2437P = obtainStyledAttributes.getBoolean(C7461j.AlertDialog_showTitle, true);
        this.f2444d = obtainStyledAttributes.getDimensionPixelSize(C7461j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0964i.supportRequestWindowFeature(1);
    }

    /* renamed from: A */
    private static boolean m37835A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7452a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m37834a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m37834a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    private void m37833b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    static void m37828g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: j */
    private ViewGroup m37825j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    private int m37824k() {
        int i = this.f2432K;
        if (i == 0) {
            return this.f2431J;
        }
        return this.f2438Q == 1 ? i : this.f2431J;
    }

    /* renamed from: q */
    private void m37818q(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f2443c.findViewById(C7457f.scrollIndicatorUp);
        View findViewById2 = this.f2443c.findViewById(C7457f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C7759x.m17556F0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f2446f != null) {
            this.f2422A.setOnScrollChangeListener(new C0913b(this, findViewById, findViewById2));
            this.f2422A.post(new RunnableC0914c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f2447g;
        if (listView != null) {
            listView.setOnScrollListener(new C0915d(this, findViewById, findViewById2));
            this.f2447g.post(new RunnableC0916e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: v */
    private void m37813v(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f2455o = button;
        button.setOnClickListener(this.f2440S);
        if (TextUtils.isEmpty(this.f2456p) && this.f2458r == null) {
            this.f2455o.setVisibility(8);
            z = false;
        } else {
            this.f2455o.setText(this.f2456p);
            Drawable drawable = this.f2458r;
            if (drawable != null) {
                int i = this.f2444d;
                drawable.setBounds(0, 0, i, i);
                this.f2455o.setCompoundDrawables(this.f2458r, null, null, null);
            }
            this.f2455o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f2459s = button2;
        button2.setOnClickListener(this.f2440S);
        if (TextUtils.isEmpty(this.f2460t) && this.f2462v == null) {
            this.f2459s.setVisibility(8);
        } else {
            this.f2459s.setText(this.f2460t);
            Drawable drawable2 = this.f2462v;
            if (drawable2 != null) {
                int i2 = this.f2444d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f2459s.setCompoundDrawables(this.f2462v, null, null, null);
            }
            this.f2459s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f2463w = button3;
        button3.setOnClickListener(this.f2440S);
        if (TextUtils.isEmpty(this.f2464x) && this.f2466z == null) {
            this.f2463w.setVisibility(8);
        } else {
            this.f2463w.setText(this.f2464x);
            Drawable drawable3 = this.f2466z;
            if (drawable3 != null) {
                int i3 = this.f2444d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f2463w.setCompoundDrawables(this.f2466z, null, null, null);
            }
            this.f2463w.setVisibility(0);
            z |= true;
        }
        if (m37835A(this.f2441a)) {
            if (z) {
                m37833b(this.f2455o);
            } else if (z) {
                m37833b(this.f2459s);
            } else if (z) {
                m37833b(this.f2463w);
            }
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m37812w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f2443c.findViewById(C7457f.scrollView);
        this.f2422A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f2422A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f2427F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f2446f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f2422A.removeView(this.f2427F);
        if (this.f2447g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f2422A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f2422A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f2447g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m37811x(ViewGroup viewGroup) {
        View view = this.f2448h;
        if (view == null) {
            view = this.f2449i != 0 ? LayoutInflater.from(this.f2441a).inflate(this.f2449i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m37834a(view)) {
            this.f2443c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f2443c.findViewById(C7457f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f2454n) {
                frameLayout.setPadding(this.f2450j, this.f2451k, this.f2452l, this.f2453m);
            }
            if (this.f2447g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.C1037a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    private void m37810y(ViewGroup viewGroup) {
        if (this.f2428G != null) {
            viewGroup.addView(this.f2428G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2443c.findViewById(C7457f.title_template).setVisibility(8);
            return;
        }
        this.f2425D = (ImageView) this.f2443c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f2445e)) && this.f2437P) {
            TextView textView = (TextView) this.f2443c.findViewById(C7457f.alertTitle);
            this.f2426E = textView;
            textView.setText(this.f2445e);
            int i = this.f2423B;
            if (i != 0) {
                this.f2425D.setImageResource(i);
                return;
            }
            Drawable drawable = this.f2424C;
            if (drawable != null) {
                this.f2425D.setImageDrawable(drawable);
                return;
            }
            this.f2426E.setPadding(this.f2425D.getPaddingLeft(), this.f2425D.getPaddingTop(), this.f2425D.getPaddingRight(), this.f2425D.getPaddingBottom());
            this.f2425D.setVisibility(8);
            return;
        }
        this.f2443c.findViewById(C7457f.title_template).setVisibility(8);
        this.f2425D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private void m37809z() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f2443c.findViewById(C7457f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C7457f.topPanel);
        View findViewById5 = findViewById3.findViewById(C7457f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C7457f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C7457f.customPanel);
        m37811x(viewGroup);
        View findViewById7 = viewGroup.findViewById(C7457f.topPanel);
        View findViewById8 = viewGroup.findViewById(C7457f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C7457f.buttonPanel);
        ViewGroup m37825j = m37825j(findViewById7, findViewById4);
        ViewGroup m37825j2 = m37825j(findViewById8, findViewById5);
        ViewGroup m37825j3 = m37825j(findViewById9, findViewById6);
        m37812w(m37825j2);
        m37813v(m37825j3);
        m37810y(m37825j);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (m37825j == null || m37825j.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (m37825j3 == null || m37825j3.getVisibility() == 8) ? false : true;
        if (!z3 && m37825j2 != null && (findViewById2 = m37825j2.findViewById(C7457f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f2422A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f2446f != null || this.f2447g != null) {
                view = m37825j.findViewById(C7457f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (m37825j2 != null && (findViewById = m37825j2.findViewById(C7457f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f2447g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m37808a(z2, z3);
        }
        if (!z) {
            View view2 = this.f2447g;
            if (view2 == null) {
                view2 = this.f2422A;
            }
            if (view2 != null) {
                m37818q(m37825j2, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f2447g;
        if (listView2 == null || (listAdapter = this.f2429H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f2430I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    /* renamed from: c */
    public Button m37832c(int i) {
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    return null;
                }
                return this.f2455o;
            }
            return this.f2459s;
        }
        return this.f2463w;
    }

    /* renamed from: d */
    public int m37831d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f2441a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m37830e() {
        return this.f2447g;
    }

    /* renamed from: f */
    public void m37829f() {
        this.f2442b.setContentView(m37824k());
        m37809z();
    }

    /* renamed from: h */
    public boolean m37827h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2422A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: i */
    public boolean m37826i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2422A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: l */
    public void m37823l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2439R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f2464x = charSequence;
            this.f2465y = message;
            this.f2466z = drawable;
        } else if (i == -2) {
            this.f2460t = charSequence;
            this.f2461u = message;
            this.f2462v = drawable;
        } else if (i == -1) {
            this.f2456p = charSequence;
            this.f2457q = message;
            this.f2458r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void m37822m(View view) {
        this.f2428G = view;
    }

    /* renamed from: n */
    public void m37821n(int i) {
        this.f2424C = null;
        this.f2423B = i;
        ImageView imageView = this.f2425D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f2425D.setImageResource(this.f2423B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void m37820o(Drawable drawable) {
        this.f2424C = drawable;
        this.f2423B = 0;
        ImageView imageView = this.f2425D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f2425D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: p */
    public void m37819p(CharSequence charSequence) {
        this.f2446f = charSequence;
        TextView textView = this.f2427F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m37817r(CharSequence charSequence) {
        this.f2445e = charSequence;
        TextView textView = this.f2426E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m37816s(int i) {
        this.f2448h = null;
        this.f2449i = i;
        this.f2454n = false;
    }

    /* renamed from: t */
    public void m37815t(View view) {
        this.f2448h = view;
        this.f2449i = 0;
        this.f2454n = false;
    }

    /* renamed from: u */
    public void m37814u(View view, int i, int i2, int i3, int i4) {
        this.f2448h = view;
        this.f2449i = 0;
        this.f2454n = true;
        this.f2450j = i;
        this.f2451k = i2;
        this.f2452l = i3;
        this.f2453m = i4;
    }
}
