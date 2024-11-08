/*
 * Copyright 2024 PixelsDB.
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
package io.pixelsdb.pixels.common.transaction;

public class QueryCost
{
    private QueryCostType type;
    private double costCents;
    private double[] durations;

    public QueryCost(QueryCostType type, double costCents)
    {
        this.type = type;
        this.costCents = costCents;
    }

    public QueryCost(QueryCostType type, double costCents, double[] durations)
    {
        this.type = type;
        this.costCents = costCents;
        this.durations = durations;
    }

    void setCostCents(double cost)  { this.costCents = cost; }

    void setType(QueryCostType type) { this.type = type; }

    void setDurations(double[] durations)  { this.durations = durations; }

    public double getCostCents() { return costCents; }

    public QueryCostType getType() { return type; }

    public double[] getDurations() { return durations; }

}
