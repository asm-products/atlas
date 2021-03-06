/*
 *  * Copyright (c) May 2, 2013 Csikos Balint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Csikos Balint - initial API and implementation and/or initial documentation
 */
package hu.fnf.devel.atlas;

import android.os.Bundle;
import android.util.Log;
import hu.fnf.devel.atlas.backend.TopLevelView;
import hu.fnf.devel.atlas.base.TopFragment;

public class IncomeTrendFragment extends TopFragment {

    public IncomeTrendFragment() {
        super();
        this.setName(AtlasData.TINCOME);
        Log.d("PropertyFragment", "constructor called.");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        TopLevelView chart = (TopLevelView) getView().findViewById(R.id.topview);

        loadChart(chart, AtlasData.INCOME);
        super.onActivityCreated(savedInstanceState);
    }
}