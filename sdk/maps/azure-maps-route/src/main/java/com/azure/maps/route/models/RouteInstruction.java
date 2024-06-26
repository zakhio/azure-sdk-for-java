// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.models.GeoPosition;
import com.azure.maps.route.implementation.models.LatLongPair;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A set of attributes describing a maneuver, e.g. 'Turn right', 'Keep left', 'Take the ferry', 'Take the motorway',
 * 'Arrive'.
 */
@Fluent
public final class RouteInstruction {
    /*
     * Distance from the start of the route to the point of the instruction.
     */
    @JsonProperty(value = "routeOffsetInMeters", access = JsonProperty.Access.WRITE_ONLY)
    private Integer routeOffsetInMeters;

    /*
     * Estimated travel time up to the point corresponding to
     * routeOffsetInMeters.
     */
    @JsonProperty(value = "travelTimeInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer travelTimeInSeconds;

    /*
     * A location represented as a latitude and longitude.
     */
    @JsonProperty(value = "point")
    private LatLongPair point;

    /*
     * The index of the point in the list of polyline "points" corresponding to
     * the point of the instruction.
     */
    @JsonProperty(value = "pointIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer pointIndex;

    /*
     * Type of the instruction, e.g., turn or change of road form.
     */
    @JsonProperty(value = "instructionType")
    private GuidanceInstructionType instructionType;

    /*
     * The road number(s) of the next significant road segment(s) after the
     * maneuver, or of the road(s) to be followed. Example: ["E34", "N205"]
     */
    @JsonProperty(value = "roadNumbers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> roadNumbers;

    /*
     * The number(s) of a highway exit taken by the current maneuver. If an
     * exit has multiple exit numbers, they will be separated by "," and
     * possibly aggregated by "-", e.g., "10, 13-15".
     */
    @JsonProperty(value = "exitNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String exitNumber;

    /*
     * Street name of the next significant road segment after the maneuver, or
     * of the street that should be followed.
     */
    @JsonProperty(value = "street", access = JsonProperty.Access.WRITE_ONLY)
    private String street;

    /*
     * The text on a signpost which is most relevant to the maneuver, or to the
     * direction that should be followed.
     */
    @JsonProperty(value = "signpostText", access = JsonProperty.Access.WRITE_ONLY)
    private String signpostText;

    /*
     * 3-character [ISO
     * 3166-1](https://www.iso.org/iso-3166-country-codes.html) alpha-3 country
     * code. E.g. USA.
     */
    @JsonProperty(value = "countryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCode;

    /*
     * A subdivision (e.g., state) of the country, represented by the second
     * part of an [ISO 3166-2](https://www.iso.org/standard/63546.html) code.
     * This is only available for some countries like the US, Canada, and
     * Mexico.
     */
    @JsonProperty(value = "stateCode", access = JsonProperty.Access.WRITE_ONLY)
    private String stateCode;

    /*
     * The type of the junction where the maneuver takes place. For larger
     * roundabouts, two separate instructions are generated for entering and
     * leaving the roundabout.
     */
    @JsonProperty(value = "junctionType", access = JsonProperty.Access.WRITE_ONLY)
    private JunctionType junctionType;

    /*
     * Indicates the direction of an instruction. If junctionType indicates a
     * turn instruction:
     *
     * * 180 = U-turn
     * * [-179, -1] = Left turn
     * * 0 = Straight on (a '0 degree' turn)
     * * [1, 179] = Right turn
     *
     * If junctionType indicates a bifurcation instruction:
     *
     * * <0 - keep left
     * * \>0 - keep right
     */
    @JsonProperty(value = "turnAngleInDecimalDegrees", access = JsonProperty.Access.WRITE_ONLY)
    private Integer turnAngleInDegrees;

    /*
     * This indicates which exit to take at a roundabout.
     */
    @JsonProperty(value = "roundaboutExitNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String roundaboutExitNumber;

    /*
     * It is possible to optionally combine the instruction with the next one.
     * This can be used to build messages like "Turn left and then turn right".
     */
    @JsonProperty(value = "possibleCombineWithNext", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean possibleCombineWithNext;

    /*
     * Indicates left-hand vs. right-hand side driving at the point of the
     * maneuver.
     */
    @JsonProperty(value = "drivingSide", access = JsonProperty.Access.WRITE_ONLY)
    private DrivingSide drivingSide;

    /*
     * A code identifying the maneuver.
     */
    @JsonProperty(value = "maneuver", access = JsonProperty.Access.WRITE_ONLY)
    private GuidanceManeuver maneuver;

    /*
     * A human-readable message for the maneuver.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * A human-readable message for the maneuver combined with the message from
     * the next instruction. Sometimes it is possible to combine two successive
     * instructions into a single instruction making it easier to follow. When
     * this is the case the possibleCombineWithNext flag will be true. For
     * example:
     *
     * ```
     * 10. Turn left onto Einsteinweg/A10/E22 towards Ring Amsterdam
     * 11. Follow Einsteinweg/A10/E22 towards Ring Amsterdam
     * ```
     *
     * The possibleCombineWithNext flag on instruction 10 is true. This
     * indicates to the clients of coded guidance that it can be combined with
     * instruction 11. The instructions will be combined automatically for
     * clients requesting human-readable guidance. The combinedMessage field
     * contains the combined message:
     *
     * ```
     * Turn left onto Einsteinweg/A10/E22 towards Ring Amsterdam
     * then follow Einsteinweg/A10/E22 towards Ring Amsterdam.
     * ```
     */
    @JsonProperty(value = "combinedMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String combinedMessage;

    /**
     * Get the routeOffsetInMeters property: Distance from the start of the route to the point of the instruction.
     *
     * @return the routeOffsetInMeters value.
     */
    public Integer getRouteOffsetInMeters() {
        return this.routeOffsetInMeters;
    }

    /**
     * Get the travelTimeInSeconds property: Estimated travel time up to the point corresponding to routeOffsetInMeters.
     *
     * @return the travelTimeInSeconds value.
     */
    public Integer getTravelTimeInSeconds() {
        return this.travelTimeInSeconds;
    }

    /**
     * Get the point property: A location represented as a latitude and longitude.
     *
     * @return the point value.
     */
    public GeoPosition getPoint() {
        LatLongPair returnValue = this.point;
        return new GeoPosition(returnValue.getLongitude(), returnValue.getLatitude());
    }

    /**
     * Get the pointIndex property: The index of the point in the list of polyline "points" corresponding to the point
     * of the instruction.
     *
     * @return the pointIndex value.
     */
    public Integer getPointIndex() {
        return this.pointIndex;
    }

    /**
     * Get the instructionType property: Type of the instruction, e.g., turn or change of road form.
     *
     * @return the instructionType value.
     */
    public GuidanceInstructionType getInstructionType() {
        return this.instructionType;
    }

    /**
     * Set the instructionType property: Type of the instruction, e.g., turn or change of road form.
     *
     * @param instructionType the instructionType value to set.
     * @return the RouteInstruction object itself.
     */
    public RouteInstruction setInstructionType(GuidanceInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    /**
     * Get the roadNumbers property: The road number(s) of the next significant road segment(s) after the maneuver, or
     * of the road(s) to be followed. Example: ["E34", "N205"].
     *
     * @return the roadNumbers value.
     */
    public List<String> getRoadNumbers() {
        return this.roadNumbers;
    }

    /**
     * Get the exitNumber property: The number(s) of a highway exit taken by the current maneuver. If an exit has
     * multiple exit numbers, they will be separated by "," and possibly aggregated by "-", e.g., "10, 13-15".
     *
     * @return the exitNumber value.
     */
    public String getExitNumber() {
        return this.exitNumber;
    }

    /**
     * Get the street property: Street name of the next significant road segment after the maneuver, or of the street
     * that should be followed.
     *
     * @return the street value.
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Get the signpostText property: The text on a signpost which is most relevant to the maneuver, or to the direction
     * that should be followed.
     *
     * @return the signpostText value.
     */
    public String getSignpostText() {
        return this.signpostText;
    }

    /**
     * Get the countryCode property: 3-character [ISO 3166-1](https://www.iso.org/iso-3166-country-codes.html) alpha-3
     * country code. E.g. USA.
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Get the stateCode property: A subdivision (e.g., state) of the country, represented by the second part of an [ISO
     * 3166-2](https://www.iso.org/standard/63546.html) code. This is only available for some countries like the US,
     * Canada, and Mexico.
     *
     * @return the stateCode value.
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Get the junctionType property: The type of the junction where the maneuver takes place. For larger roundabouts,
     * two separate instructions are generated for entering and leaving the roundabout.
     *
     * @return the junctionType value.
     */
    public JunctionType getJunctionType() {
        return this.junctionType;
    }

    /**
     * Get the turnAngleInDegrees property: Indicates the direction of an instruction. If junctionType indicates a turn
     * instruction:
     *
     * <p>* 180 = U-turn * [-179, -1] = Left turn * 0 = Straight on (a '0 degree' turn) * [1, 179] = Right turn
     *
     * <p>If junctionType indicates a bifurcation instruction:
     *
     * <p>* &lt;0 - keep left * \&gt;0 - keep right.
     *
     * @return the turnAngleInDegrees value.
     */
    public Integer getTurnAngleInDegrees() {
        return this.turnAngleInDegrees;
    }

    /**
     * Get the roundaboutExitNumber property: This indicates which exit to take at a roundabout.
     *
     * @return the roundaboutExitNumber value.
     */
    public String getRoundaboutExitNumber() {
        return this.roundaboutExitNumber;
    }

    /**
     * Get the possibleCombineWithNext property: It is possible to optionally combine the instruction with the next one.
     * This can be used to build messages like "Turn left and then turn right".
     *
     * @return the possibleCombineWithNext value.
     */
    public Boolean isPossibleCombineWithNext() {
        return this.possibleCombineWithNext;
    }

    /**
     * Get the drivingSide property: Indicates left-hand vs. right-hand side driving at the point of the maneuver.
     *
     * @return the drivingSide value.
     */
    public DrivingSide getDrivingSide() {
        return this.drivingSide;
    }

    /**
     * Get the maneuver property: A code identifying the maneuver.
     *
     * @return the maneuver value.
     */
    public GuidanceManeuver getManeuver() {
        return this.maneuver;
    }

    /**
     * Get the message property: A human-readable message for the maneuver.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the combinedMessage property: A human-readable message for the maneuver combined with the message from the
     * next instruction. Sometimes it is possible to combine two successive instructions into a single instruction
     * making it easier to follow. When this is the case the possibleCombineWithNext flag will be true. For example:
     *
     * <p>``` 10. Turn left onto Einsteinweg/A10/E22 towards Ring Amsterdam 11. Follow Einsteinweg/A10/E22 towards Ring
     * Amsterdam ```
     *
     * <p>The possibleCombineWithNext flag on instruction 10 is true. This indicates to the clients of coded guidance
     * that it can be combined with instruction 11. The instructions will be combined automatically for clients
     * requesting human-readable guidance. The combinedMessage field contains the combined message:
     *
     * <p>``` Turn left onto Einsteinweg/A10/E22 towards Ring Amsterdam then follow Einsteinweg/A10/E22 towards Ring
     * Amsterdam. ```.
     *
     * @return the combinedMessage value.
     */
    public String getCombinedMessage() {
        return this.combinedMessage;
    }
}
