package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p201g.p202a.C7452a;
import p201g.p202a.C7457f;
import p201g.p241i.p242a.AbstractC7780c;
/* compiled from: SuggestionsAdapter.java */
/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes2.dex */
class View$OnClickListenerC1123l0 extends AbstractC7780c implements View.OnClickListener {

    /* renamed from: D */
    private final SearchView f3413D;

    /* renamed from: E */
    private final SearchableInfo f3414E;

    /* renamed from: F */
    private final Context f3415F;

    /* renamed from: G */
    private final WeakHashMap<String, Drawable.ConstantState> f3416G;

    /* renamed from: H */
    private final int f3417H;

    /* renamed from: I */
    private boolean f3418I;

    /* renamed from: J */
    private int f3419J;

    /* renamed from: K */
    private ColorStateList f3420K;

    /* renamed from: L */
    private int f3421L;

    /* renamed from: M */
    private int f3422M;

    /* renamed from: N */
    private int f3423N;

    /* renamed from: O */
    private int f3424O;

    /* renamed from: P */
    private int f3425P;

    /* renamed from: Q */
    private int f3426Q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuggestionsAdapter.java */
    /* renamed from: androidx.appcompat.widget.l0$a */
    /* loaded from: classes2.dex */
    public static final class C1124a {

        /* renamed from: a */
        public final TextView f3427a;

        /* renamed from: b */
        public final TextView f3428b;

        /* renamed from: c */
        public final ImageView f3429c;

        /* renamed from: d */
        public final ImageView f3430d;

        /* renamed from: e */
        public final ImageView f3431e;

        public C1124a(View view) {
            this.f3427a = (TextView) view.findViewById(16908308);
            this.f3428b = (TextView) view.findViewById(16908309);
            this.f3429c = (ImageView) view.findViewById(16908295);
            this.f3430d = (ImageView) view.findViewById(16908296);
            this.f3431e = (ImageView) view.findViewById(C7457f.edit_query);
        }
    }

    public View$OnClickListenerC1123l0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f3418I = false;
        this.f3419J = 1;
        this.f3421L = -1;
        this.f3422M = -1;
        this.f3423N = -1;
        this.f3424O = -1;
        this.f3425P = -1;
        this.f3426Q = -1;
        this.f3413D = searchView;
        this.f3414E = searchableInfo;
        this.f3417H = searchView.getSuggestionCommitIconResId();
        this.f3415F = context;
        this.f3416G = weakHashMap;
    }

    /* renamed from: A */
    private void m37086A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3416G.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m37085B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: k */
    private Drawable m37084k(String str) {
        Drawable.ConstantState constantState = this.f3416G.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m37083l(CharSequence charSequence) {
        if (this.f3420K == null) {
            TypedValue typedValue = new TypedValue();
            this.f3415F.getTheme().resolveAttribute(C7452a.textColorSearchUrl, typedValue, true);
            this.f3420K = this.f3415F.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3420K, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m37082m(ComponentName componentName) {
        PackageManager packageManager = this.f3415F.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m37081n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f3416G.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f3416G.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f3415F.getResources());
        }
        Drawable m37082m = m37082m(componentName);
        this.f3416G.put(flattenToShortString, m37082m != null ? m37082m.getConstantState() : null);
        return m37082m;
    }

    /* renamed from: o */
    public static String m37080o(Cursor cursor, String str) {
        return m37072w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m37079p() {
        Drawable m37081n = m37081n(this.f3414E.getSearchActivity());
        return m37081n != null ? m37081n : this.f3415F.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m37078q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m37077r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f3415F.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m37076s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3415F.getPackageName() + "/" + parseInt;
            Drawable m37084k = m37084k(str2);
            if (m37084k != null) {
                return m37084k;
            }
            Drawable m36322f = C1335a.m36322f(this.f3415F, parseInt);
            m37086A(str2, m36322f);
            return m36322f;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m37084k2 = m37084k(str);
            if (m37084k2 != null) {
                return m37084k2;
            }
            Drawable m37078q = m37078q(Uri.parse(str));
            m37086A(str, m37078q);
            return m37078q;
        }
    }

    /* renamed from: t */
    private Drawable m37075t(Cursor cursor) {
        int i = this.f3424O;
        if (i == -1) {
            return null;
        }
        Drawable m37076s = m37076s(cursor.getString(i));
        return m37076s != null ? m37076s : m37079p();
    }

    /* renamed from: u */
    private Drawable m37074u(Cursor cursor) {
        int i = this.f3425P;
        if (i == -1) {
            return null;
        }
        return m37076s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m37072w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m37070y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m37069z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p201g.p241i.p242a.AbstractC7775a, p201g.p241i.p242a.C7778b.InterfaceC7779a
    /* renamed from: a */
    public void mo17430a(Cursor cursor) {
        if (this.f3418I) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo17430a(cursor);
            if (cursor != null) {
                this.f3421L = cursor.getColumnIndex("suggest_text_1");
                this.f3422M = cursor.getColumnIndex("suggest_text_2");
                this.f3423N = cursor.getColumnIndex("suggest_text_2_url");
                this.f3424O = cursor.getColumnIndex("suggest_icon_1");
                this.f3425P = cursor.getColumnIndex("suggest_icon_2");
                this.f3426Q = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p201g.p241i.p242a.AbstractC7775a, p201g.p241i.p242a.C7778b.InterfaceC7779a
    /* renamed from: c */
    public CharSequence mo17428c(Cursor cursor) {
        String m37080o;
        String m37080o2;
        if (cursor == null) {
            return null;
        }
        String m37080o3 = m37080o(cursor, "suggest_intent_query");
        if (m37080o3 != null) {
            return m37080o3;
        }
        if (!this.f3414E.shouldRewriteQueryFromData() || (m37080o2 = m37080o(cursor, "suggest_intent_data")) == null) {
            if (!this.f3414E.shouldRewriteQueryFromText() || (m37080o = m37080o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return m37080o;
        }
        return m37080o2;
    }

    @Override // p201g.p241i.p242a.C7778b.InterfaceC7779a
    /* renamed from: d */
    public Cursor mo17427d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f3413D.getVisibility() == 0 && this.f3413D.getWindowVisibility() == 0) {
            try {
                Cursor m37073v = m37073v(this.f3414E, charSequence2, 50);
                if (m37073v != null) {
                    m37073v.getCount();
                    return m37073v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p201g.p241i.p242a.AbstractC7775a
    /* renamed from: e */
    public void mo17434e(View view, Context context, Cursor cursor) {
        CharSequence m37072w;
        C1124a c1124a = (C1124a) view.getTag();
        int i = this.f3426Q;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c1124a.f3427a != null) {
            m37069z(c1124a.f3427a, m37072w(cursor, this.f3421L));
        }
        if (c1124a.f3428b != null) {
            String m37072w2 = m37072w(cursor, this.f3423N);
            if (m37072w2 != null) {
                m37072w = m37083l(m37072w2);
            } else {
                m37072w = m37072w(cursor, this.f3422M);
            }
            if (TextUtils.isEmpty(m37072w)) {
                TextView textView = c1124a.f3427a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c1124a.f3427a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c1124a.f3427a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c1124a.f3427a.setMaxLines(1);
                }
            }
            m37069z(c1124a.f3428b, m37072w);
        }
        ImageView imageView = c1124a.f3429c;
        if (imageView != null) {
            m37070y(imageView, m37075t(cursor), 4);
        }
        ImageView imageView2 = c1124a.f3430d;
        if (imageView2 != null) {
            m37070y(imageView2, m37074u(cursor), 8);
        }
        int i3 = this.f3419J;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c1124a.f3431e.setVisibility(8);
            return;
        }
        c1124a.f3431e.setVisibility(0);
        c1124a.f3431e.setTag(c1124a.f3427a.getText());
        c1124a.f3431e.setOnClickListener(this);
    }

    @Override // p201g.p241i.p242a.AbstractC7775a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo17426g = mo17426g(this.f3415F, mo17429b(), viewGroup);
            if (mo17426g != null) {
                ((C1124a) mo17426g.getTag()).f3427a.setText(e.toString());
            }
            return mo17426g;
        }
    }

    @Override // p201g.p241i.p242a.AbstractC7775a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo17425h = mo17425h(this.f3415F, mo17429b(), viewGroup);
            if (mo17425h != null) {
                ((C1124a) mo17425h.getTag()).f3427a.setText(e.toString());
            }
            return mo17425h;
        }
    }

    @Override // p201g.p241i.p242a.AbstractC7780c, p201g.p241i.p242a.AbstractC7775a
    /* renamed from: h */
    public View mo17425h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo17425h = super.mo17425h(context, cursor, viewGroup);
        mo17425h.setTag(new C1124a(mo17425h));
        ((ImageView) mo17425h.findViewById(C7457f.edit_query)).setImageResource(this.f3417H);
        return mo17425h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m37085B(mo17429b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m37085B(mo17429b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3413D.m37346U((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m37077r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3415F.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: v */
    Cursor m37073v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f3415F.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m37071x(int i) {
        this.f3419J = i;
    }
}
