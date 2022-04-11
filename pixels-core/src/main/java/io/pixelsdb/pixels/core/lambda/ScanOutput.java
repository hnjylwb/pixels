/*
 * Copyright 2022 PixelsDB.
 *
 * This file is part of Pixels.
 *
 * Pixels is free software: you can redistribute it and/or modify
 * it under the terms of the Affero GNU General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Pixels is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Affero GNU General Public License for more details.
 *
 * You should have received a copy of the Affero GNU General Public
 * License along with Pixels.  If not, see
 * <https://www.gnu.org/licenses/>.
 */
package io.pixelsdb.pixels.core.lambda;

import java.util.ArrayList;

import static java.util.Objects.requireNonNull;

/**
 * @author hank
 * Created at: 11/04/2022
 */
public class ScanOutput
{
    /**
     * The path of the scan result files. No need to contain endpoint information.
     */
    private ArrayList<String> outputs;

    public ScanOutput()
    {
        this.outputs = new ArrayList<>();
    }

    public ScanOutput(ArrayList<String> outputs)
    {
        requireNonNull(outputs, "outputs is null");
        this.outputs = outputs;
    }

    public ArrayList<String> getOutputs()
    {
        return outputs;
    }

    public void setOutputs(ArrayList<String> outputs)
    {
        this.outputs = outputs;
    }

    public void addOutput(String output)
    {
        this.outputs.add(output);
    }
}