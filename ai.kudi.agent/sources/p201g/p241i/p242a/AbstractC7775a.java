package p201g.p241i.p242a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p201g.p241i.p242a.C7778b;
/* compiled from: CursorAdapter.java */
/* renamed from: g.i.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7775a extends BaseAdapter implements Filterable, C7778b.InterfaceC7779a {

    /* renamed from: c */
    protected boolean f18537c;

    /* renamed from: d */
    protected boolean f18538d;

    /* renamed from: e */
    protected Cursor f18539e;

    /* renamed from: f */
    protected Context f18540f;

    /* renamed from: w */
    protected int f18541w;

    /* renamed from: x */
    protected C7776a f18542x;

    /* renamed from: y */
    protected DataSetObserver f18543y;

    /* renamed from: z */
    protected C7778b f18544z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: g.i.a.a$a */
    /* loaded from: classes2.dex */
    public class C7776a extends ContentObserver {
        C7776a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC7775a.this.m17432i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: g.i.a.a$b */
    /* loaded from: classes2.dex */
    public class C7777b extends DataSetObserver {
        C7777b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC7775a abstractC7775a = AbstractC7775a.this;
            abstractC7775a.f18537c = true;
            abstractC7775a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC7775a abstractC7775a = AbstractC7775a.this;
            abstractC7775a.f18537c = false;
            abstractC7775a.notifyDataSetInvalidated();
        }
    }

    public AbstractC7775a(Context context, Cursor cursor, boolean z) {
        m17433f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo17430a(Cursor cursor) {
        Cursor m17431j = m17431j(cursor);
        if (m17431j != null) {
            m17431j.close();
        }
    }

    @Override // p201g.p241i.p242a.C7778b.InterfaceC7779a
    /* renamed from: b */
    public Cursor mo17429b() {
        return this.f18539e;
    }

    /* renamed from: c */
    public abstract CharSequence mo17428c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo17434e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m17433f(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f18538d = true;
        } else {
            this.f18538d = false;
        }
        boolean z = cursor != null;
        this.f18539e = cursor;
        this.f18537c = z;
        this.f18540f = context;
        this.f18541w = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f18542x = new C7776a();
            this.f18543y = new C7777b();
        } else {
            this.f18542x = null;
            this.f18543y = null;
        }
        if (z) {
            C7776a c7776a = this.f18542x;
            if (c7776a != null) {
                cursor.registerContentObserver(c7776a);
            }
            DataSetObserver dataSetObserver = this.f18543y;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo17426g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f18537c || (cursor = this.f18539e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f18537c) {
            this.f18539e.moveToPosition(i);
            if (view == null) {
                view = mo17426g(this.f18540f, this.f18539e, viewGroup);
            }
            mo17434e(view, this.f18540f, this.f18539e);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f18544z == null) {
            this.f18544z = new C7778b(this);
        }
        return this.f18544z;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f18537c || (cursor = this.f18539e) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f18539e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f18537c && (cursor = this.f18539e) != null && cursor.moveToPosition(i)) {
            return this.f18539e.getLong(this.f18541w);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f18537c) {
            if (this.f18539e.moveToPosition(i)) {
                if (view == null) {
                    view = mo17425h(this.f18540f, this.f18539e, viewGroup);
                }
                mo17434e(view, this.f18540f, this.f18539e);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo17425h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m17432i() {
        Cursor cursor;
        if (!this.f18538d || (cursor = this.f18539e) == null || cursor.isClosed()) {
            return;
        }
        this.f18537c = this.f18539e.requery();
    }

    /* renamed from: j */
    public Cursor m17431j(Cursor cursor) {
        Cursor cursor2 = this.f18539e;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C7776a c7776a = this.f18542x;
            if (c7776a != null) {
                cursor2.unregisterContentObserver(c7776a);
            }
            DataSetObserver dataSetObserver = this.f18543y;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f18539e = cursor;
        if (cursor != null) {
            C7776a c7776a2 = this.f18542x;
            if (c7776a2 != null) {
                cursor.registerContentObserver(c7776a2);
            }
            DataSetObserver dataSetObserver2 = this.f18543y;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f18541w = cursor.getColumnIndexOrThrow("_id");
            this.f18537c = true;
            notifyDataSetChanged();
        } else {
            this.f18541w = -1;
            this.f18537c = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
