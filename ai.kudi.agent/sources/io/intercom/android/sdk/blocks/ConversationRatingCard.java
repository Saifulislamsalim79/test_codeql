package io.intercom.android.sdk.blocks;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.models.ConversationRating;
import io.intercom.android.sdk.blocks.models.ConversationRatingOption;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.LongTermImageLoader;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.views.ButtonSelector;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ConversationRatingCard implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private ConversationRating conversationRating;
    private final ColorFilter deselectedFilter;
    private final FeedbackDialog formula;
    private LongTermImageLoader longTermImageLoader;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConversationRatingCard $r2 = ConversationRatingCard.this;
            List $r3 = $r2.ratingViews;
            int $i0 = $r3.indexOf(view);
            if ($i0 != -1) {
                ConversationRatingCard $r22 = ConversationRatingCard.this;
                List $r32 = $r22.ratingViews;
                int $i1 = $r32.size();
                ConversationRatingCard $r23 = ConversationRatingCard.this;
                ConversationRating $r4 = $r23.conversationRating;
                List $r33 = $r4.getOptions();
                int $i2 = $r33.size();
                if ($i1 != $i2) {
                    return;
                }
                ConversationRatingCard $r24 = ConversationRatingCard.this;
                ConversationRating $r42 = $r24.conversationRating;
                ConversationRatingCard $r5 = ConversationRatingCard.this;
                ConversationRating $r6 = $r5.conversationRating;
                List $r34 = $r6.getOptions();
                Object $r7 = $r34.get($i0);
                ConversationRatingOption $r8 = (ConversationRatingOption) $r7;
                $r24.rateConversation($r42, $r8);
                ConversationRatingCard $r25 = ConversationRatingCard.this;
                $r25.updateSelectedRating();
            }
        }
    };
    private final List<ImageView> ratingViews;
    private final C10486i requestManager;
    private LinearLayout rootLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConversationRatingCard(FeedbackDialog feedbackDialog, String str, Provider provider, C10486i c10486i) {
        this.formula = feedbackDialog;
        this.conversationId = str;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        ArrayList $r7 = new ArrayList();
        this.ratingViews = $r7;
        ColorFilter $r5 = ColorUtils.newGreyscaleFilter();
        this.deselectedFilter = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View createConversationRatingBlock(ConversationRating conversationRating, ViewGroup viewGroup) {
        Context $r3 = viewGroup.getContext();
        List $r4 = this.ratingViews;
        $r4.clear();
        this.conversationRating = conversationRating;
        LongTermImageLoader $r5 = LongTermImageLoader.newInstance($r3);
        this.longTermImageLoader = $r5;
        LayoutInflater $r6 = LayoutInflater.from($r3);
        int $i0 = C10110R.C10113layout.intercom_conversation_rating_block;
        View $r7 = $r6.inflate($i0, viewGroup, false);
        LinearLayout $r8 = (LinearLayout) $r7;
        this.rootLayout = $r8;
        updateViewVisibility();
        LinearLayout $r82 = this.rootLayout;
        int $i02 = C10110R.C10112id.intercom_rating_tell_us_more_button;
        View $r72 = $r82.findViewById($i02);
        android.widget.Button $r9 = (android.widget.Button) $r72;
        Provider $r10 = this.appConfigProvider;
        Object $r11 = $r10.get();
        AppConfig $r12 = (AppConfig) $r11;
        int $i03 = $r12.getPrimaryColor();
        int $i1 = C10110R.C10111drawable.intercom_border;
        Drawable r15 = new ButtonSelector($r3, $i1, $i03);
        Drawable r17 = r15;
        BackgroundUtils.setBackground($r9, r17);
        FontUtils.setRobotoMediumTypeface($r9);
        $r9.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConversationRatingCard $r1 = ConversationRatingCard.this;
                Context $r2 = view.getContext();
                $r1.showRemarkDialog($r2);
            }
        });
        setupRatingsLayout();
        updateSelectedRating();
        LinearLayout $r83 = this.rootLayout;
        return $r83;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void deselectView(ImageView imageView) {
        ViewPropertyAnimator $r2 = imageView.animate();
        OvershootInterpolator $r3 = new OvershootInterpolator(0.6f);
        $r2.setInterpolator($r3).scaleX(DESELECTED_RATING_SCALE).scaleY(DESELECTED_RATING_SCALE).setDuration(ANIMATION_DURATION_MS).start();
        ColorFilter $r4 = this.deselectedFilter;
        imageView.setColorFilter($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private io.intercom.android.sdk.blocks.models.ConversationRatingOption findSelectedOption() {
        /*
            r10 = this;
            io.intercom.android.sdk.blocks.models.ConversationRating r0 = r10.conversationRating
            java.util.List r1 = r0.getOptions()
            java.util.Iterator r2 = r1.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r4 = r2.next()
            r6 = r4
            io.intercom.android.sdk.blocks.models.ConversationRatingOption r6 = (io.intercom.android.sdk.blocks.models.ConversationRatingOption) r6
            r5 = r6
            java.lang.Integer r7 = r5.getIndex()
            io.intercom.android.sdk.blocks.models.ConversationRating r0 = r10.conversationRating
            java.lang.Integer r8 = r0.getRatingIndex()
            boolean r3 = r7.equals(r8)
            if (r3 == 0) goto La
            return r5
        L29:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.ConversationRatingCard.findSelectedOption():io.intercom.android.sdk.blocks.models.ConversationRatingOption");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static String imageUrlForUnicode(String str) {
        String $r1 = "https://js.intercomcdn.com/images/stickers/" + str + ".png";
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void selectView(float f, ImageView imageView) {
        ViewPropertyAnimator $r3 = imageView.animate();
        OvershootInterpolator $r2 = new OvershootInterpolator(2.0f);
        $r3.setInterpolator($r2).scaleX(f).scaleY(f).setDuration(ANIMATION_DURATION_MS).start();
        imageView.clearColorFilter();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setupRatingsLayout() {
        LinearLayout $r2 = this.rootLayout;
        View $r3 = $r2.findViewById(C10110R.C10112id.intercom_rating_options_layout);
        LinearLayout $r22 = (LinearLayout) $r3;
        LinearLayout $r4 = this.rootLayout;
        Context $r5 = $r4.getContext();
        int $i0 = ScreenUtils.dpToPx(RATING_VERTICAL_PADDING, $r5);
        int $i1 = ScreenUtils.dpToPx(RATING_HORIZONTAL_PADDING, $r5);
        int $i2 = 0;
        while (true) {
            ConversationRating $r6 = this.conversationRating;
            List $r7 = $r6.getOptions();
            int $i3 = $r7.size();
            if ($i2 >= $i3) {
                return;
            }
            ConversationRating $r62 = this.conversationRating;
            List $r72 = $r62.getOptions();
            Object $r8 = $r72.get($i2);
            FrameLayout $r1 = new FrameLayout($r5);
            $r1.setClipChildren(false);
            $r1.setClipToPadding(false);
            LinearLayout.LayoutParams $r10 = new LinearLayout.LayoutParams(0, -1, DESELECTED_RATING_SCALE);
            $r1.setLayoutParams($r10);
            final ImageView $r11 = new ImageView($r5);
            Resources $r12 = $r5.getResources();
            int $i32 = C10110R.dimen.intercom_conversation_rating_size;
            int $i33 = $r12.getDimensionPixelSize($i32);
            FrameLayout.LayoutParams $r13 = new FrameLayout.LayoutParams($i33, $i33, 17);
            $r13.setMargins($i1, $i0, $i1, $i0);
            $r11.setLayoutParams($r13);
            $r11.setLongClickable(false);
            String $r14 = ((ConversationRatingOption) $r8).getUnicode();
            String $r142 = imageUrlForUnicode($r14);
            LongTermImageLoader $r15 = this.longTermImageLoader;
            LongTermImageLoader.OnImageReadyListener onImageReadyListener = new LongTermImageLoader.OnImageReadyListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.android.sdk.imageloader.LongTermImageLoader.OnImageReadyListener
                public void onImageReady(Bitmap bitmap) {
                    ImageView $r23 = $r11;
                    $r23.setImageBitmap(bitmap);
                }
            };
            C10486i $r17 = this.requestManager;
            $r15.loadImage($r142, onImageReadyListener, $r17);
            View.OnClickListener $r18 = this.ratingClickListener;
            $r11.setOnClickListener($r18);
            $r1.addView($r11);
            $r22.addView($r1);
            List $r73 = this.ratingViews;
            $r73.add($r11);
            $i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showRemarkDialog(Context context) {
        DialogInterfaceC0936d.C0937a r16 = new DialogInterfaceC0936d.C0937a(context);
        r16.setTitle(C10110R.string.intercom_tell_us_more);
        LinearLayout r17 = new LinearLayout(context);
        r17.setOrientation(1);
        LinearLayout.LayoutParams r18 = new LinearLayout.LayoutParams(-1, -2);
        int $i0 = ScreenUtils.dpToPx(DIALOG_HORIZONTAL_MARGIN, context);
        r18.setMargins($i0, 0, $i0, 0);
        final EditText r19 = new EditText(context);
        Drawable $r7 = r19.getBackground();
        Drawable $r72 = $r7.mutate();
        Provider $r8 = this.appConfigProvider;
        Object $r9 = $r8.get();
        AppConfig $r10 = (AppConfig) $r9;
        int $i02 = $r10.getPrimaryColor();
        PorterDuff.Mode $r1 = PorterDuff.Mode.SRC_ATOP;
        $r72.setColorFilter($i02, $r1);
        r19.setLayoutParams(r18);
        r17.addView(r19);
        r16.setView(r17);
        r16.setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                EditText $r2 = r19;
                Editable $r3 = $r2.getText();
                String $r4 = $r3.toString();
                ConversationRatingCard $r5 = ConversationRatingCard.this;
                ConversationRating $r6 = $r5.conversationRating;
                $r5.addRemarkToConversation($r6, $r4);
            }
        });
        r16.setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        final DialogInterfaceC0936d $r13 = r16.create();
        DialogInterfaceC0936d r23 = $r13;
        r23.show();
        r19.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    Dialog $r2 = $r13;
                    Dialog r4 = $r2;
                    Window $r3 = r4.getWindow();
                    if ($r3 != null) {
                        Dialog $r22 = $r13;
                        Dialog r42 = $r22;
                        Window $r32 = r42.getWindow();
                        $r32.setSoftInputMode(5);
                    }
                }
            }
        });
        android.widget.Button $r15 = $r13.m37786a(-1);
        Provider $r82 = this.appConfigProvider;
        Object $r92 = $r82.get();
        AppConfig $r102 = (AppConfig) $r92;
        $r15.setTextColor($r102.getPrimaryColor());
        android.widget.Button $r152 = $r13.m37786a(-2);
        Provider $r83 = this.appConfigProvider;
        Object $r93 = $r83.get();
        AppConfig $r103 = (AppConfig) $r93;
        $r152.setTextColor($r103.getPrimaryColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateSelectedRating() {
        ConversationRating $r1 = this.conversationRating;
        List $r2 = $r1.getOptions();
        int $i0 = $r2.size();
        List $r22 = this.ratingViews;
        int $i1 = $r22.size();
        if ($i0 != $i1) {
            return;
        }
        int $i02 = 0;
        while (true) {
            ConversationRating $r12 = this.conversationRating;
            List $r23 = $r12.getOptions();
            int $i12 = $r23.size();
            if ($i02 >= $i12) {
                return;
            }
            ConversationRating $r13 = this.conversationRating;
            List $r24 = $r13.getOptions();
            Object $r3 = $r24.get($i02);
            ConversationRatingOption $r4 = (ConversationRatingOption) $r3;
            List $r25 = this.ratingViews;
            Object $r32 = $r25.get($i02);
            ImageView $r5 = (ImageView) $r32;
            ConversationRating $r14 = this.conversationRating;
            Integer $r6 = $r14.getRatingIndex();
            int $i13 = $r6.intValue();
            if ($i13 == -1) {
                selectView(DESELECTED_RATING_SCALE, $r5);
            } else {
                ConversationRating $r15 = this.conversationRating;
                Integer $r62 = $r15.getRatingIndex();
                Integer $r7 = $r4.getIndex();
                boolean $z0 = $r62.equals($r7);
                if ($z0) {
                    selectView(SELECTED_RATING_SCALE, $r5);
                } else {
                    deselectView($r5);
                }
            }
            $i02++;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void updateViewVisibility() {
        LinearLayout $r1 = this.rootLayout;
        if ($r1 == null) {
            return;
        }
        ConversationRating $r2 = this.conversationRating;
        Integer $r3 = $r2.getRatingIndex();
        int $i0 = $r3.intValue();
        boolean $z0 = $i0 != -1;
        ConversationRating $r22 = this.conversationRating;
        String $r4 = $r22.getRemark();
        boolean $z1 = !TextUtils.isEmpty($r4);
        LinearLayout $r12 = this.rootLayout;
        int $i02 = C10110R.C10112id.rate_your_conversation_text_view;
        View $r5 = $r12.findViewById($i02);
        TextView $r6 = (TextView) $r5;
        int $i03 = $z1 ? 8 : 0;
        $r6.setVisibility($i03);
        LinearLayout $r13 = this.rootLayout;
        int $i04 = C10110R.C10112id.intercom_rating_options_layout;
        View $r52 = $r13.findViewById($i04);
        LinearLayout $r14 = (LinearLayout) $r52;
        int $i05 = $z1 ? 8 : 0;
        $r14.setVisibility($i05);
        LinearLayout $r15 = this.rootLayout;
        int $i06 = C10110R.C10112id.intercom_rating_tell_us_more_button;
        View $r53 = $r15.findViewById($i06);
        android.widget.Button button = (android.widget.Button) $r53;
        int $i07 = (!$z0 || $z1) ? 8 : 0;
        button.setVisibility($i07);
        LinearLayout $r16 = this.rootLayout;
        int $i08 = C10110R.C10112id.intercom_you_rated_layout;
        View $r54 = $r16.findViewById($i08);
        LinearLayout $r17 = (LinearLayout) $r54;
        int $i1 = $z1 ? 0 : 8;
        $r17.setVisibility($i1);
        ConversationRatingOption $r8 = findSelectedOption();
        if ($r8 != null) {
            LinearLayout $r18 = this.rootLayout;
            int $i12 = C10110R.C10112id.intercom_you_rated_image_view;
            View $r55 = $r18.findViewById($i12);
            final ImageView $r9 = (ImageView) $r55;
            String $r42 = $r8.getUnicode();
            String $r43 = imageUrlForUnicode($r42);
            LongTermImageLoader $r10 = this.longTermImageLoader;
            LongTermImageLoader.OnImageReadyListener onImageReadyListener = new LongTermImageLoader.OnImageReadyListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.android.sdk.imageloader.LongTermImageLoader.OnImageReadyListener
                public void onImageReady(Bitmap bitmap) {
                    ImageView $r23 = $r9;
                    $r23.setImageBitmap(bitmap);
                }
            };
            C10486i $r122 = this.requestManager;
            $r10.loadImage($r43, onImageReadyListener, $r122);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.ConversationRatingBlock
    public View addConversationRatingBlock(ConversationRating conversationRating, boolean z, boolean z2, ViewGroup viewGroup) {
        View $r2 = createConversationRatingBlock(conversationRating, viewGroup);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void addRemarkToConversation(ConversationRating conversationRating, String str) {
        String $r3 = conversationRating.getRemark();
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            conversationRating.setRemark(str);
            FeedbackDialog $r4 = this.formula;
            String $r32 = this.conversationId;
            $r4.addConversationRatingRemark($r32, str);
            updateViewVisibility();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void rateConversation(ConversationRating conversationRating, ConversationRatingOption conversationRatingOption) {
        Integer $r3 = conversationRating.getRatingIndex();
        Integer $r4 = conversationRatingOption.getIndex();
        boolean $z0 = $r3.equals($r4);
        if ($z0) {
            return;
        }
        Integer $r32 = conversationRatingOption.getIndex();
        int $i0 = $r32.intValue();
        conversationRating.setRatingIndex($i0);
        FeedbackDialog $r5 = this.formula;
        String $r6 = this.conversationId;
        Integer $r33 = conversationRatingOption.getIndex();
        int $i02 = $r33.intValue();
        $r5.rateConversation($r6, $i02);
        updateViewVisibility();
    }
}
