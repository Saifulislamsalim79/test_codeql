package ai.kudi.dip.library.p043h.p044l;

import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.p045i.C0826e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
/* compiled from: OptionPickerAdapter.kt */
/* renamed from: ai.kudi.dip.library.h.l.d */
/* loaded from: classes2.dex */
public final class C0819d extends RecyclerView.AbstractC1623h<C0821b> {

    /* renamed from: a */
    private Field f2306a;

    /* renamed from: b */
    private ArrayList<C0821b> f2307b = new ArrayList<>();

    /* renamed from: c */
    private final C1713j.AbstractC1719f<Field> f2308c = new C0820a();

    /* renamed from: d */
    private final C1681d<Field> f2309d = new C1681d<>(this, this.f2308c);

    /* compiled from: OptionPickerAdapter.kt */
    /* renamed from: ai.kudi.dip.library.h.l.d$a */
    /* loaded from: classes2.dex */
    public static final class C0820a extends C1713j.AbstractC1719f<Field> {
        C0820a() {
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public boolean areContentsTheSame(Field field, Field field2) {
            l.f(field, "oldItem");
            l.f(field2, "newItem");
            return field.equals(field2);
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public boolean areItemsTheSame(Field field, Field field2) {
            l.f(field, "oldItem");
            l.f(field2, "newItem");
            return l.b(field.getName(), field2.getName()) && l.b(field, field2) && field.getId() == field2.getId();
        }
    }

    /* compiled from: OptionPickerAdapter.kt */
    /* renamed from: ai.kudi.dip.library.h.l.d$b */
    /* loaded from: classes2.dex */
    public final class C0821b extends RecyclerView.AbstractC1620e0 {

        /* renamed from: a */
        private final C0826e f2310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0821b(C0819d c0819d, C0826e c0826e) {
            super(c0826e.getRoot());
            l.f(c0819d, "this$0");
            l.f(c0826e, "binding");
            this.f2310a = c0826e;
        }

        public final void bind(Field field) {
            l.f(field, "subField");
            this.f2310a.f2325c.setText(field.getName());
        }

        public final ImageView getCheckBox() {
            ImageView imageView = this.f2310a.f2324b;
            l.e(imageView, "binding.ivCheckIcon");
            return imageView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m37939c(C0819d c0819d, Field field, C0821b c0821b, View view) {
        l.f(c0819d, "this$0");
        l.f(c0821b, "$holder");
        c0819d.f2306a = field;
        for (C0821b c0821b2 : c0819d.f2307b) {
            c0821b2.getCheckBox().setImageResource(C0756b.ic_unchecked);
            c0821b.getCheckBox().setImageResource(C0756b.ic_checked);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: b */
    public void onBindViewHolder(final C0821b c0821b, int i) {
        l.f(c0821b, "holder");
        final Field field = this.f2309d.m34821b().get(c0821b.getAdapterPosition());
        if (!this.f2307b.contains(c0821b)) {
            this.f2307b.add(c0821b);
        }
        l.e(field, "currentItem");
        c0821b.bind(field);
        c0821b.itemView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.l.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0819d.m37939c(C0819d.this, field, c0821b, view);
            }
        });
        if (l.b(this.f2306a, field)) {
            c0821b.getCheckBox().setImageResource(C0756b.ic_checked);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: d */
    public C0821b onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        C0826e m37922c = C0826e.m37922c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        l.e(m37922c, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        return new C0821b(this, m37922c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f2309d.m34821b().size();
    }

    public final Field getSelectedItem() {
        return this.f2306a;
    }

    public final void setItemList(List<Field> list) {
        l.f(list, "items");
        this.f2309d.m34818e(list);
    }
}
