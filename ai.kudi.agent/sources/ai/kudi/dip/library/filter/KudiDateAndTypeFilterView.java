package ai.kudi.dip.library.filter;

import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0799g;
import ai.kudi.dip.library.p045i.C0823b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: KudiDateAndTypeFilterView.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001aR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/dip/library/filter/KudiDateAndTypeFilterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "array", "Landroid/content/res/TypedArray;", "binding", "Lai/kudi/dip/library/databinding/CustomListFilterViewBinding;", "dateFilterClickedListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "getDateFilterClickedListener", "()Lkotlin/jvm/functions/Function1;", "setDateFilterClickedListener", "(Lkotlin/jvm/functions/Function1;)V", "dateFilterDrawable", "dateFilterText", "", "dateTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "filterActionView", "typeFilterClickListener", "getTypeFilterClickListener", "setTypeFilterClickListener", "typeFilterDrawable", "typeFilterText", "setDateText", AttributeType.TEXT, "setTypeText", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiDateAndTypeFilterView extends LinearLayout {

    /* renamed from: A */
    private final AppCompatTextView f2253A;

    /* renamed from: B */
    private final C0823b f2254B;

    /* renamed from: c */
    private int f2255c;

    /* renamed from: d */
    private int f2256d;

    /* renamed from: e */
    private String f2257e;

    /* renamed from: f */
    private String f2258f;

    /* renamed from: w */
    private TypedArray f2259w;

    /* renamed from: x */
    private InterfaceC11767l<? super View, C13666w> f2260x;

    /* renamed from: y */
    private InterfaceC11767l<? super View, C13666w> f2261y;

    /* renamed from: z */
    private final AppCompatTextView f2262z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiDateAndTypeFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        C0823b m37931c = C0823b.m37931c(LayoutInflater.from(context), this, true);
        l.e(m37931c, "inflate(LayoutInflater.from(context), this, true)");
        this.f2254B = m37931c;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0799g.KudiDateAndTypeFilterView);
        l.e(obtainStyledAttributes, "getContext().obtainStyledAttributes(attributeSet, R.styleable.KudiDateAndTypeFilterView)");
        this.f2259w = obtainStyledAttributes;
        this.f2255c = obtainStyledAttributes.getResourceId(C0799g.KudiDateAndTypeFilterView_dateFilterDrawable, C0756b.ic_date_picker);
        this.f2256d = this.f2259w.getResourceId(C0799g.KudiDateAndTypeFilterView_typeFilterDrawable, C0756b.ic_arrow_down);
        this.f2257e = this.f2259w.getString(C0799g.KudiDateAndTypeFilterView_dateFilterText);
        this.f2258f = this.f2259w.getString(C0799g.KudiDateAndTypeFilterView_typeFilterText);
        this.f2259w.recycle();
        AppCompatTextView appCompatTextView = this.f2254B.f2317c;
        l.e(appCompatTextView, "binding.filterAction");
        this.f2262z = appCompatTextView;
        AppCompatTextView appCompatTextView2 = this.f2254B.f2316b;
        l.e(appCompatTextView2, "binding.dateTextView");
        this.f2253A = appCompatTextView2;
        this.f2262z.setText(this.f2258f);
        this.f2253A.setText(this.f2257e);
        this.f2262z.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f2256d, 0);
        this.f2253A.setCompoundDrawablesWithIntrinsicBounds(this.f2255c, 0, 0, 0);
        this.f2253A.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.filter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KudiDateAndTypeFilterView.m37980a(KudiDateAndTypeFilterView.this, view);
            }
        });
        this.f2262z.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.filter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KudiDateAndTypeFilterView.m37979b(KudiDateAndTypeFilterView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m37980a(KudiDateAndTypeFilterView kudiDateAndTypeFilterView, View view) {
        l.f(kudiDateAndTypeFilterView, "this$0");
        InterfaceC11767l<View, C13666w> dateFilterClickedListener = kudiDateAndTypeFilterView.getDateFilterClickedListener();
        if (dateFilterClickedListener == null) {
            return;
        }
        l.e(view, "it");
        dateFilterClickedListener.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m37979b(KudiDateAndTypeFilterView kudiDateAndTypeFilterView, View view) {
        l.f(kudiDateAndTypeFilterView, "this$0");
        InterfaceC11767l<View, C13666w> typeFilterClickListener = kudiDateAndTypeFilterView.getTypeFilterClickListener();
        if (typeFilterClickListener == null) {
            return;
        }
        l.e(view, "it");
        typeFilterClickListener.invoke(view);
    }

    public final InterfaceC11767l<View, C13666w> getDateFilterClickedListener() {
        return this.f2260x;
    }

    public final InterfaceC11767l<View, C13666w> getTypeFilterClickListener() {
        return this.f2261y;
    }

    public final void setDateFilterClickedListener(InterfaceC11767l<? super View, C13666w> interfaceC11767l) {
        this.f2260x = interfaceC11767l;
    }

    public final void setDateText(String str) {
        l.f(str, AttributeType.TEXT);
        this.f2253A.setText(str);
    }

    public final void setTypeFilterClickListener(InterfaceC11767l<? super View, C13666w> interfaceC11767l) {
        this.f2261y = interfaceC11767l;
    }

    public final void setTypeText(String str) {
        l.f(str, AttributeType.TEXT);
        this.f2262z.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KudiDateAndTypeFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }
}
