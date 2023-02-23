package p201g.p241i.p242a;

import android.database.Cursor;
import android.widget.Filter;
/* compiled from: CursorFilter.java */
/* renamed from: g.i.a.b */
/* loaded from: classes2.dex */
class C7778b extends Filter {

    /* renamed from: a */
    InterfaceC7779a f18547a;

    /* compiled from: CursorFilter.java */
    /* renamed from: g.i.a.b$a */
    /* loaded from: classes2.dex */
    interface InterfaceC7779a {
        /* renamed from: a */
        void mo17430a(Cursor cursor);

        /* renamed from: b */
        Cursor mo17429b();

        /* renamed from: c */
        CharSequence mo17428c(Cursor cursor);

        /* renamed from: d */
        Cursor mo17427d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7778b(InterfaceC7779a interfaceC7779a) {
        this.f18547a = interfaceC7779a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f18547a.mo17428c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo17427d = this.f18547a.mo17427d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo17427d != null) {
            filterResults.count = mo17427d.getCount();
            filterResults.values = mo17427d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo17429b = this.f18547a.mo17429b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo17429b) {
            return;
        }
        this.f18547a.mo17430a((Cursor) obj);
    }
}
