import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import React from 'react'

export default function App() {
  return (
    <View style={styles.cabecalho}>
      <View style={{width: 50, height: 50, backgroundColor: 'steelblue', borderRadius: 15}}></View>
      <View style={{width: 150, height: 10, backgroundColor: 'steelblue', borderRadius: 40}}></View>
      <View style={{width: 50, height: 50, backgroundColor: 'steelblue', borderRadius: 15}}></View>
    </View>
  );
}

export function promo() {
  return (
    <View style={styles.container}>
      <View style={{width: 200, height: 200, backgroundColor: 'steelblue'}}></View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'powderblue',
    alignItems: 'center',
    justifyContent: 'center',
  },
  cabecalho: {
    flexDirection: 'row',
    flexBasis: 100,
    width: '100%',
    backgroundColor: 'powderblue',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingTop: 15,
    paddingHorizontal: 20
  }
});